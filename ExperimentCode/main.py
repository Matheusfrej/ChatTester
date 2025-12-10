# -*- coding: utf-8 -*-

import os
import sys
from datetime import datetime
import traceback

# Add parent directory to path for imports
current_dir = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, current_dir)

from InitialPhrase_Experiment import ChatGptTester_inital
from ChatGptTester import ChatGptTester
from ProcesFinalResult import ProceFinalResult

# Get chat tester root directory
chatTesterDir = os.path.dirname(current_dir)

# Projects to process
PROJECTS = [
    'sachin-handiekar_jInstagram.json',
    'tabulapdf_tabula-java.json',
    'Zappos_zappos-json.json'
]

def print_section(title):
    """Print a formatted section header."""
    print("\n" + "="*70)
    print(f"  {title}")
    print("="*70 + "\n")

def run_initial_phrase(projects, timestamp):
    """
    Run InitialPhrase_Experiment for all projects.
    
    Args:
        projects (list): List of project JSON filenames
        timestamp (str): Timestamp for grouping outputs
    
    Returns:
        bool: True if all projects completed successfully, False otherwise
    """
    print_section("STAGE 1: Initial Phrase Experiment")
    print(f"Timestamp: {timestamp}")
    print(f"Processing {len(projects)} projects...\n")
    
    intention_tag = 'Contain_intention'
    failed_projects = []
    
    for project_name in projects:
        try:
            print(f"  → Processing: {project_name}")
            json_path = os.path.join(chatTesterDir, "RepoData", project_name)
            
            if not os.path.exists(json_path):
                print(f"    ✗ JSON file not found: {json_path}")
                failed_projects.append(project_name)
                continue
            
            # Run InitialPhrase with timestamp
            ChatGptTester_inital(intention_tag, timestamp, json_path)
            print(f"    ✓ Completed successfully")
            
        except FileExistsError as fe:
            print(f"    ✗ File exists error: {fe}")
            failed_projects.append(project_name)
        except Exception as e:
            print(f"    ✗ Error: {str(e)}")
            failed_projects.append(project_name)
            traceback.print_exc()
    
    print(f"\n{'─'*70}")
    print(f"InitialPhrase completed: {len(projects) - len(failed_projects)}/{len(projects)} successful")
    
    if failed_projects:
        print(f"Failed projects: {', '.join(failed_projects)}")
        return False
    
    return True

def run_chat_gpt_tester(projects, timestamp):
    """
    Run ChatGptTester for all projects.
    
    Args:
        projects (list): List of project names (without .json)
        timestamp (str): Timestamp for grouping outputs
    
    Returns:
        bool: True if all projects completed successfully, False otherwise
    """
    print_section("STAGE 2: ChatGpt Tester (Iterative Repair)")
    print(f"Timestamp: {timestamp}")
    print(f"Processing {len(projects)} projects...\n")
    
    failed_projects = []
    
    for project_json in projects:
        try:
            project_name = project_json.replace(".json", "")
            print(f"  → Processing: {project_name}")
            json_path = os.path.join(chatTesterDir, "RepoData", project_json)
            
            if not os.path.exists(json_path):
                print(f"    ✗ JSON file not found: {json_path}")
                failed_projects.append(project_name)
                continue
            
            # Run ChatGptTester with timestamp
            ChatGptTester(project_name, timestamp, json_path)
            print(f"    ✓ Completed iterative repair")
            
            # Run ProcesFinalResult post-processing with same timestamp
            print(f"    → Post-processing results...")
            ProceFinalResult(project_name, json_path, timestamp)
            print(f"    ✓ Post-processing completed")
            
        except FileExistsError as fe:
            print(f"    ✗ File exists error: {fe}")
            failed_projects.append(project_name)
        except Exception as e:
            print(f"    ✗ Error: {str(e)}")
            failed_projects.append(project_name)
            traceback.print_exc()
    
    print(f"\n{'─'*70}")
    print(f"ChatGptTester completed: {len(projects) - len(failed_projects)}/{len(projects)} successful")
    
    if failed_projects:
        print(f"Failed projects: {', '.join(failed_projects)}")
        return False
    
    return True

def main():
    print("\n" + "="*70)
    print("                     ChatTester Pipeline")
    print("="*70)
    
    # Track execution time
    start_time = datetime.now()
    
    # Generate timestamp
    timestamp = start_time.strftime('%Y%m%d_%H%M%S')
    print(f"\nPipeline started at: {start_time.strftime('%Y-%m-%d %H:%M:%S')}")
    print(f"Timestamp for this run: {timestamp}")    
    try:
        # Stage 1: Initial Phrase Experiment
        run_initial_phrase(PROJECTS, timestamp)
        
        # Stage 2: ChatGptTester (includes ProcesFinalResult post-processing)
        run_chat_gpt_tester(PROJECTS, timestamp)
        
    except KeyboardInterrupt:
        print("\n\n✗ Pipeline interrupted by user")
        return 130
    except Exception as e:
        print(f"\n✗ Unexpected error in pipeline: {str(e)}")
        if "--verbose" in sys.argv:
            traceback.print_exc()
        return 1

    # Calculate and display total duration
    end_time = datetime.now()
    duration = end_time - start_time
    hours, remainder = divmod(int(duration.total_seconds()), 3600)
    minutes, seconds = divmod(remainder, 60)
    
    print(f"\nPipeline ended at: {end_time.strftime('%Y-%m-%d %H:%M:%S')}")
    print(f"\n{'='*70}")
    print(f"Total Pipeline Duration: {hours}h {minutes}m {seconds}s")
    print("="*70 + "\n")


if __name__ == "__main__":
    main()

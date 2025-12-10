#!/usr/bin/env python3
"""
Script to analyze test generation results from JSONL file.
Generates statistics, formatted tables, and exportable graphs.
"""

import json
import sys
from pathlib import Path
from collections import Counter
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from tabulate import tabulate

COMPILED_FIELD_NAME="Compile"
TESTED_FIELD_NAME="Test"

# COMPILED_FIELD_NAME="Compile_result"
# TESTED_FIELD_NAME="Test_result"


# Set style for better-looking plots
sns.set_style("whitegrid")
plt.rcParams['figure.figsize'] = (12, 8)
plt.rcParams['font.size'] = 10


def read_jsonl(file_path):
    """Read JSONL file and return list of records."""
    records = []
    with open(file_path, 'r', encoding='utf-8') as f:
        for line in f:
            line = line.strip()
            if line:
                try:
                    records.append(json.loads(line))
                except json.JSONDecodeError as e:
                    print(f"Warning: Skipping invalid JSON line: {e}", file=sys.stderr)
    return records


def analyze_records(records):
    """Analyze records and return statistics."""
    total = len(records)
    
    # Count by Compile and Test status
    neither = sum(1 for r in records if r.get(COMPILED_FIELD_NAME, 0) == 0 and r.get(TESTED_FIELD_NAME, 0) == 0)
    compiled_only = sum(1 for r in records if r.get(COMPILED_FIELD_NAME, 0) == 1 and r.get(TESTED_FIELD_NAME, 0) == 0)
    compiled_and_tested = sum(1 for r in records if r.get(COMPILED_FIELD_NAME, 0) == 1 and r.get(TESTED_FIELD_NAME, 0) == 1)
    
    # Also count compile=0, test=1 (edge case)
    test_only = sum(1 for r in records if r.get(COMPILED_FIELD_NAME, 0) == 0 and r.get(TESTED_FIELD_NAME, 0) == 1)
    
    return {
        'total': total,
        'neither': neither,
        'compiled_only': compiled_only,
        'compiled_and_tested': compiled_and_tested,
        'test_only': test_only
    }


def create_summary_table(stats):
    """Create formatted summary table."""
    data = [
        ['Total Records', stats['total'], f"{100.0:.1f}%"],
        ['Neither Compiled nor Tested', stats['neither'], f"{stats['neither']/stats['total']*100:.1f}%"],
        ['Compiled Only', stats['compiled_only'], f"{stats['compiled_only']/stats['total']*100:.1f}%"],
        ['Compiled and Tested', stats['compiled_and_tested'], f"{stats['compiled_and_tested']/stats['total']*100:.1f}%"],
    ]
    
    if stats['test_only'] > 0:
        data.append(['Test Only (No Compile)', stats['test_only'], f"{stats['test_only']/stats['total']*100:.1f}%"])
    
    df = pd.DataFrame(data, columns=['Category', 'Count', 'Percentage'])
    return df


def create_detailed_table(records):
    """Create detailed breakdown table."""
    df = pd.DataFrame(records)
    
    # Create status column
    def get_status(row):
        compile_val = row.get(COMPILED_FIELD_NAME, 0)
        test_val = row.get(TESTED_FIELD_NAME, 0)
        if compile_val == 0 and test_val == 0:
            return 'Neither'
        elif compile_val == 1 and test_val == 0:
            return 'Compiled Only'
        elif compile_val == 1 and test_val == 1:
            return 'Compiled and Tested'
        else:
            return 'Test Only (No Compile)'
    
    df['Status'] = df.apply(get_status, axis=1)
    
    # Count by status
    status_counts = df['Status'].value_counts().reset_index()
    status_counts.columns = ['Status', 'Count']
    status_counts['Percentage'] = (status_counts['Count'] / len(df) * 100).round(1)
    status_counts = status_counts.sort_values('Count', ascending=False)
    
    return status_counts


def create_bar_chart(stats, output_path='results_bar_chart.png'):
    """Create bar chart of results."""
    categories = ['Neither\nCompiled\nnor Tested', 'Compiled\nOnly', 'Compiled\nand\nTested']
    counts = [stats['neither'], stats['compiled_only'], stats['compiled_and_tested']]
    colors = ['#e74c3c', '#f39c12', '#27ae60']
    
    fig, ax = plt.subplots(figsize=(10, 6))
    bars = ax.bar(categories, counts, color=colors, edgecolor='black', linewidth=1.5)
    
    # Add value labels on bars
    for bar, count in zip(bars, counts):
        height = bar.get_height()
        ax.text(bar.get_x() + bar.get_width()/2., height,
                f'{count}\n({count/stats["total"]*100:.1f}%)',
                ha='center', va='bottom', fontsize=11, fontweight='bold')
    
    ax.set_ylabel('Number of Records', fontsize=12, fontweight='bold')
    ax.set_xlabel('Status', fontsize=12, fontweight='bold')
    ax.set_title('Test Generation Results Distribution', fontsize=14, fontweight='bold', pad=20)
    ax.set_ylim(0, max(counts) * 1.15)
    ax.grid(axis='y', alpha=0.3, linestyle='--')
    
    plt.tight_layout()
    plt.savefig(output_path, dpi=300, bbox_inches='tight')
    print(f"Bar chart saved to: {output_path}")
    return fig


def create_pie_chart(stats, output_path='results_pie_chart.png'):
    """Create pie chart of results."""
    labels = ['Neither Compiled nor Tested', 'Compiled Only', 'Compiled and Tested']
    sizes = [stats['neither'], stats['compiled_only'], stats['compiled_and_tested']]
    colors = ['#e74c3c', '#f39c12', '#27ae60']
    explode = (0.05, 0.05, 0.05)  # Slight separation
    
    fig, ax = plt.subplots(figsize=(10, 8))
    wedges, texts, autotexts = ax.pie(sizes, explode=explode, labels=labels, colors=colors,
                                       autopct='%1.1f%%', shadow=True, startangle=90,
                                       textprops={'fontsize': 11, 'fontweight': 'bold'})
    
    # Make percentage text white and bold
    for autotext in autotexts:
        autotext.set_color('white')
        autotext.set_fontweight('bold')
        autotext.set_fontsize(12)
    
    ax.set_title('Test Generation Results Distribution', fontsize=14, fontweight='bold', pad=20)
    
    # Add legend with counts
    legend_labels = [f'{label}: {size}' for label, size in zip(labels, sizes)]
    ax.legend(wedges, legend_labels, loc="center left", bbox_to_anchor=(1, 0, 0.5, 1))
    
    plt.tight_layout()
    plt.savefig(output_path, dpi=300, bbox_inches='tight')
    print(f"Pie chart saved to: {output_path}")
    return fig


def create_stacked_bar_chart(stats, output_path='results_stacked_chart.png'):
    """Create stacked bar chart showing progression."""
    categories = ['Total', 'Compiled', 'Tested']
    compiled_count = stats['compiled_only'] + stats['compiled_and_tested']
    tested_count = stats['compiled_and_tested']
    
    fig, ax = plt.subplots(figsize=(10, 6))
    
    # Create stacked bars
    p1 = ax.barh(0, stats['total'], color='#95a5a6', label='Total Records', edgecolor='black', linewidth=1.5)
    p2 = ax.barh(0, compiled_count, color='#3498db', label='Compiled', edgecolor='black', linewidth=1.5)
    p3 = ax.barh(0, tested_count, color='#27ae60', label='Compiled and Tested', edgecolor='black', linewidth=1.5)
    
    # Add value labels
    ax.text(stats['total']/2, 0, f"Total: {stats['total']}", 
            ha='center', va='center', fontsize=12, fontweight='bold', color='white')
    ax.text(compiled_count/2, 0, f"Compiled: {compiled_count}", 
            ha='center', va='center', fontsize=12, fontweight='bold', color='white')
    ax.text(tested_count/2, 0, f"Tested: {tested_count}", 
            ha='center', va='center', fontsize=12, fontweight='bold', color='white')
    
    ax.set_xlim(0, stats['total'] * 1.1)
    ax.set_yticks([])
    ax.set_xlabel('Number of Records', fontsize=12, fontweight='bold')
    ax.set_title('Test Generation Success Pipeline', fontsize=14, fontweight='bold', pad=20)
    ax.legend(loc='upper right', fontsize=11)
    ax.grid(axis='x', alpha=0.3, linestyle='--')
    
    plt.tight_layout()
    plt.savefig(output_path, dpi=300, bbox_inches='tight')
    print(f"Stacked bar chart saved to: {output_path}")
    return fig


def main():
    if len(sys.argv) < 2:
        print("Usage: python analyze_results.py <json_file_path>")
        sys.exit(1)
    
    json_file = Path(sys.argv[1])
    if not json_file.exists():
        print(f"Error: File not found: {json_file}")
        sys.exit(1)
    
    print(f"Reading data from: {json_file}")
    records = read_jsonl(json_file)
    
    if not records:
        print("Error: No records found in file")
        sys.exit(1)
    
    print(f"\nAnalyzing {len(records)} records...\n")
    
    # Analyze records
    stats = analyze_records(records)
    
    # Print summary
    print("=" * 70)
    print("SUMMARY STATISTICS")
    print("=" * 70)
    summary_df = create_summary_table(stats)
    print(tabulate(summary_df, headers='keys', tablefmt='grid', showindex=False))
    
    print("\n" + "=" * 70)
    print("DETAILED BREAKDOWN")
    print("=" * 70)
    detailed_df = create_detailed_table(records)
    print(tabulate(detailed_df, headers='keys', tablefmt='grid', showindex=False))
    
    # Generate graphs
    print("\n" + "=" * 70)
    print("GENERATING GRAPHS")
    print("=" * 70)
    
    output_dir = json_file.parent
    base_name = json_file.stem
    
    # Bar chart
    bar_path = output_dir / f"{base_name}_bar_chart.png"
    create_bar_chart(stats, str(bar_path))
    
    # Pie chart
    pie_path = output_dir / f"{base_name}_pie_chart.png"
    create_pie_chart(stats, str(pie_path))
    
    # Stacked bar chart
    stacked_path = output_dir / f"{base_name}_stacked_chart.png"
    create_stacked_bar_chart(stats, str(stacked_path))
    
    print("\n" + "=" * 70)
    print("ANALYSIS COMPLETE")
    print("=" * 70)
    print(f"\nGraphs saved to:")
    print(f"  - {bar_path}")
    print(f"  - {pie_path}")
    print(f"  - {stacked_path}")


if __name__ == '__main__':
    main()


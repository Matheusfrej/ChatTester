#!/bin/bash

# ChatTester Pipeline Runner
# This script executes the complete test generation and repair pipeline:
# 1. InitialPhrase_Experiment.py - Generate initial test cases
# 2. ChatGptTester.py - Iteratively repair failed tests

set -e  # Exit on any error

# Get the directory where this script is located
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
REPO_ROOT="$( cd "$( dirname "$SCRIPT_DIR" )" && pwd )"

echo "=========================================="
echo "ChatTester Pipeline"
echo "=========================================="
echo "Script directory: $SCRIPT_DIR"
echo "Repository root: $REPO_ROOT"
echo ""

# Change to the ExperimentCode directory
cd "$SCRIPT_DIR"

# Step 1: Run InitialPhrase_Experiment
echo "Step 1/2: Running InitialPhrase_Experiment.py..."
echo "=========================================="
if python InitialPhrase_Experiment.py; then
    echo "✓ InitialPhrase_Experiment completed successfully"
else
    echo "✗ InitialPhrase_Experiment failed"
    exit 1
fi
echo ""

# Step 2: Run ChatGptTester
echo "Step 2/2: Running ChatGptTester.py..."
echo "=========================================="
if python ChatGptTester.py; then
    echo "✓ ChatGptTester completed successfully"
else
    echo "✗ ChatGptTester failed"
    exit 1
fi
echo ""

echo "=========================================="
echo "Pipeline completed successfully!"
echo "=========================================="

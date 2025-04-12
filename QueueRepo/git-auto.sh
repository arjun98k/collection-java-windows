#!/bin/bash

# Add all changes
git add .

# Prompt for a commit message
read -p "Enter your commit message: " commit_message

# Commit with the entered message
git commit -m "$commit_message"

# Push to the current branch
git push

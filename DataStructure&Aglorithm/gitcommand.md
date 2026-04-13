# Git Commands Reference

This document provides a list of commonly used Git commands and their descriptions.

## Configuration
- `git config --global user.name "[name]"`: Sets the name you want attached to your commit transactions.
- `git config --global user.email "[email address]"`: Sets the email you want attached to your commit transactions.

## Creating Repositories
- `git init`: Initializes a new local repository in the current directory.
- `git clone [url]`: Downloads a project and its entire version history from a remote URL.

## Making Changes
- `git status`: Lists all new or modified files to be committed.
- `git add [file]`: Snapshots the file in preparation for versioning (stages the file).
- `git add .`: Stages all changed files in the current directory and subdirectories.
- `git commit -m "[descriptive message]"`: Records file snapshots permanently in version history with a descriptive message.
- `git commit --amend`: Replaces the last commit with a new commit, useful for fixing the last commit message or adding forgotten changes.

## Branching & Merging
- `git branch`: Lists all local branches in the current repository.
- `git branch [branch-name]`: Creates a new branch.
- `git checkout [branch-name]`: Switches to the specified branch and updates the working directory.
- `git checkout -b [branch-name]`: Creates a new branch and switches to it immediately.
- `git merge [branch]`: Combines the specified branch's history into the current branch.
- `git branch -d [branch-name]`: Deletes the specified branch.

## Remote Repositories
- `git remote add [alias] [url]`: Connects your local repo to a remote server.
- `git fetch [alias]`: Downloads all history from the remote repository.
- `git pull`: Fetches and merges any commits from the tracking remote branch.
- `git push [alias] [branch]`: Uploads all local branch commits to the remote repository.

## Reviewing History
- `git log`: Lists version history for the current branch.
- `git log --oneline`: Condensed version of git log.
- `git log --graph --oneline --all`: Visualizes the branch structure in the terminal.
- `git diff`: Shows file differences not yet staged.
- `git diff --staged`: Shows file differences between staging and the last file version.
- `git show [commit]`: Outputs metadata and content changes of the specified commit.
- `git blame [file]`: Shows who changed which lines in a file and when.

## Redoing Commits & Recovery
- `git reset [file]`: Unstages the file, but preserves its contents.
- `git reset [commit]`: Undoes all commits after [commit], preserving changes locally.
- `git reset --hard [commit]`: Discards all history and changes back to the specified commit.
- `git revert [commit]`: Creates a new commit that undoes the changes of a previous commit without altering history.
- `git reflog`: Shows a log of where your HEAD has been, extremely useful for recovering "lost" commits.

## Advanced Workflows
- `git rebase [branch]`: Applies the changes from the current branch onto another branch, resulting in a linear history.
- `git cherry-pick [commit]`: Applies the changes from a specific commit to your current branch.
- `git clean -fd`: Removes untracked files and directories from the working tree.
- `git stash`: Temporarily stores all modified tracked files.
- `git stash pop`: Restores the most recently stashed files and removes them from the stash list.
- `git stash list`: Lists all stashed changes.
- `git stash drop`: Discards the most recently stashed changes.

## Maintenance & Info
- `git remote -v`: Lists all remote connections with their URLs.
- `git tag [tag-name]`: Creates a tag for a specific point in history (often used for releases).
- `git branch -m [new-name]`: Renames the current branch.

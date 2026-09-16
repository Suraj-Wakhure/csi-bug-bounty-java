# CSI Bug Bounty - Java Codebase (E-Commerce System)

Welcome to the CSI Bug Bounty event! 

## What is this?
This repository contains a simple **E-Commerce Order Management System** written in Java. It handles Users, Products, and Orders. However, it intentionally contains exactly **9 bugs**. Your objective is to find and fix all of them!

The bugs range from:
- **Easy (100 points)**: Simple logic flaws, null handling, or incorrect conditions.
- **Medium (200 points)**: Loop boundaries and concurrent modification exceptions.
- **Hard (300 points)**: Complex concurrency vulnerabilities (like double spending) and infinite recursion.

*(Note: There is also a C++ repository for this event that contains a **Digital Wallet System**. Depending on your assignment, you may be working on this Java E-Commerce system or the C++ Wallet system).*

## Project Structure
```text
csi-bug-bounty-java/
├── src/              # Core business logic (Main, Services, Models)
├── utils/            # Helper utilities and the mock database
├── Makefile          # Build scripts (for Linux/Mac)
├── build.bat         # Build script (for Windows)
└── README.md         
```

## How to Compile and Run
This project relies entirely on standard Java with no external dependencies (no Maven or Gradle required).

**Using Make or Batch script (Recommended):**
For Linux/Mac, open your terminal in this repository folder and run:
```bash
make
```
To run the main application, type:
```bash
make run
```

For Windows, open Command Prompt or PowerShell in this repository folder and run:
```cmd
build.bat
```
To run the main application, type:
```cmd
build.bat run
```

**Using standard Java commands:**
If you don't have Make installed, you can compile and run directly:
```bash
javac src/*.java utils/*.java
java src.Main
```

## Event Rules & Commit Guidelines
1. **Find and Fix:** Locate the bugs in the codebase and patch them.
2. **Commit Often:** The first person/team to correctly fix a specific bug (based on Git commit timestamps) will be awarded the points for that bug.
3. **Commit Format:** You must commit your fixes using the following format:
   - `Syntax Bug: [Your description]`
   - `Logic Bug: [Your description]`
   - `Concurrency Bug: [Your description]`

Good luck, read the code carefully, and happy debugging!

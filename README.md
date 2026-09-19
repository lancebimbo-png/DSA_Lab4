# Lab 04 - Basic Sorting

## Overview

This lab implements and tests basic sorting algorithms using Java.

The algorithms included are:

- Bubble Sort
- Selection Sort
- Insertion Sort

The lab also includes sorting Student objects by grade and by name, operation counters, edge-case testing, and manual sorting traces.

## Files

- `src/BasicSorts.java` - Contains the sorting algorithms, Student class, counters, and manual trace methods.
- `src/test/LabTestRunner.java` - Contains the test cases for the sorting algorithms.

## Features

### Integer Sorting

- Bubble Sort
- Selection Sort
- Insertion Sort

All integer sorting methods sort the values in ascending order.

### Student Sorting

The `Student` class contains:

- Name
- Grade

Students can be sorted by:

- Grade
- Name

The grade sorting maintains the original order of students with equal grades.

### Operation Counters

The program tracks:

- Comparisons
- Writes
- Swaps

The counters are reset before each sorting operation.

### Edge Cases

The test runner checks:

- Empty arrays
- Single-element arrays
- Already sorted arrays
- Reverse sorted arrays
- Duplicate values
- Stable sorting
- Student sorting by name

### Manual Trace

The program demonstrates the sorting process using:

`[7, 3, 9, 2, 5]`

The final sorted array is:

`[2, 3, 5, 7, 9]`

## How to Compile

Open the terminal inside the `src` folder and run:

    javac BasicSorts.java test\LabTestRunner.java

## How to Run

Run the test program using:

    java -ea -cp ".;test" LabTestRunner

The `-ea` option enables Java assertions.

## Test Result

All tests passed successfully.

- Passed: 7
- Failed: 0

## Complexity

| Algorithm | Best Case | Average Case | Worst Case |
|-----------|-----------|--------------|------------|
| Bubble Sort | O(n) | O(n²) | O(n²) |
| Selection Sort | O(n²) | O(n²) | O(n²) |
| Insertion Sort | O(n) | O(n²) | O(n²) |

## Requirements

- Java JDK
- Command Prompt or Terminal
- No external libraries are required.

# Java Data Structures and Algorithms (DSA)

Welcome to the Java Data Structures and Algorithms (DSA) repository! This repository contains implementations of various data structures and algorithms in Java.

## Table of Contents

1. [Introduction](#introduction)
2. [Data Structures](#data-structures)
3. [Algorithms](#algorithms)
4. [Usage](#usage)
5. [Contributing](#contributing)

## 1. Introduction

This repository aims to provide a comprehensive collection of well-documented implementations of various data structures and algorithms in Java. It is created to help individuals learn and understand data structures and algorithms better.

## 2. Data Structures

The following data structures are implemented in this repository:

- Arrays
- Linked Lists (Singly and Doubly)
- Stacks
- Queues
- Trees (Binary Search Tree, AVL Tree, etc.)
- Graphs
- Hash Tables
- Heaps
- Trie
- Disjoint Set (Union Find)

## 3. Algorithms

The following algorithms are implemented in this repository:

- Sorting Algorithms (Bubble Sort, Insertion Sort, Merge Sort, Quick Sort, etc.)
- Searching Algorithms (Linear Search, Binary Search, etc.)
- Dynamic Programming (0/1 Knapsack, Longest Common Subsequence, etc.)
- Graph Algorithms (BFS, DFS, Dijkstra's Algorithm, Bellman-Ford Algorithm, etc.)
- String Algorithms (KMP Algorithm, Rabin-Karp Algorithm, etc.)
- Backtracking Algorithms

## 4. Usage

Each data structure and algorithm implementation is provided in a separate Java file. You can simply copy the required files into your project and start using them. 

For example, to use a sorting algorithm:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(arr));

        
        // Using merge sort
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
```
## 5. Contributing

Contributions are welcome! If you'd like to add more data structures or algorithms or improve existing implementations, please feel free to open an issue or create a pull request. Please make sure to follow the contribution guidelines.

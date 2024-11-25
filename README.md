<h1 align="center">Sorting Algorithms</h1>
<h2>Branch description</h2>
This branch contains implementations of various sorting algorithms in Java.
The sorting algorithms included are:

1. **BubbleSortOptimised**: Repeatedly compares adjacent elements and swaps them if they are in the wrong order. The optimised version stops early if no swaps are made during a pass.
   - Time Complexity: O(N^2) 
   - Auxiliary Space: O(1)

2. **SelectionSort**: Repeatedly selects the smallest (or largest) element from the unsorted portion of the list and swaps it with the first unsorted element. This process is repeated until the entire list is sorted.
   - Time Complexity: O(N^2)
   - Auxiliary Space: O(1)

3. **InsertionSort**: A simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list.
   - Time Complexity: O(N^2)
   - Auxiliary Space: O(1)
     
4. **MergeSort**: A divide-and-conquer algorithm that splits the array into smaller subarrays, recursively sorts them, and then merges them back together.
   - Time Complexity: O(n log n)
   - Auxiliary Space: O(n)

5. **IterativeMergeSort**: A sorting algorithm that uses the divide-and-conquer approach without recursion. Instead of dividing the input array recursively, it repeatedly merges subarrays of increasing size in a bottom-up manner until the entire array is sorted.
   - Time Complexity: O(n log n)
   - Auxiliary Space: O(n)

6. **QuickSort**: A partition-based sorting algorithm. The array is partitioned around a pivot, with elements smaller than the pivot placed to its left and those greater placed to its right. This is done recursively on each partition until the array is sorted.
   - Time Complexity: Average O(n log n), Worst O(n^2)
   - Auxiliary Space: Worst O(N)

7. **HeapSort**: First, a heap is built from the input array. Then, the root element (largest element in a max heap) is swapped with the last element, and the heap is reduced by one. The heapify process is repeated until only one element remains.
   - Time Complexity: O(n log n)
   - Auxiliary Space: O(log n)

8. **ShellSort**: A variation of Insertion Sort, Shell Sort allows elements to be moved farther ahead by using a gap sequence. The array is sorted by reducing the gap until it becomes 1, improving the efficiency of the insertion process.
   - Time Complexity: Worst O(n^2), Best O(n log n)
   - Auxiliary Space: O(1)
  
9. **CombSort**: An improvement over Bubble Sort, Comb Sort uses a gap greater than 1 to remove multiple inversions at once. The gap starts large and reduces by a factor of 1.3 each iteration until it reaches 1.
   - Time Complexity: Worst O(n^2), Best O(n log n)
   - Auxiliary Space: O(1)

<h2>Technologies Used</h2>
<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>

<h2>Getting Started</h2>
To get a local copy up and running, follow these simple steps:
<br/>

Clone the sorting-algorithms branch.<br/><br/>
Compile the program using javac:<br/>
javac SortAlgorithms.java<br/><br/>
Run the compiled program using java:<br/>
java SortAlgorithms

<h2>License</h2>
Distributed under the MIT License. See LICENSE for more information.

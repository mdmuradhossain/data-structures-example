# Array Data Structure

An array is a linear data structure that collects elements of the same data type and stores them in contiguous and adjacent memory locations.
Arrays work on an index system starting from `0` to `(n-1)`, where n is the size of the array.

## Types of Array

### One-dimensional Array
In a one-dimensional array the elements are stored in contiguous memory locations where each element is accessed by using a single index value. It is a linear data structure storing all the elements in sequence.

### Two-dimensional Array
In types of arrays, a two dimensional array is a tabular representation of data where elements are stored in rows and columns. A two dimensional array is actually a collection of M X N elements which has M rows and N columns.  To access any element in a two-dimensional array two subscripts are required for defining position of an element in a specific row and column. The first index is for row number and second is for column index.

### Three-dimensional Array
In types of arrays, a three-dimensional array is an extension to the two dimensional array with addition of depth. It can be seen as a cube that has rows, columns and depth as third dimension. To access any element in a three-dimensional array three subscripts are required for position of element in a specific row, column and depth. The first index is for depth (dimension or layer), second is for row index and third is for column.


## What Operations Can You Perform on an Array?

- Traversal− Print all the elements in the array one by one.
- Insertion− Adds an element at the given index.
- Deletion− Deletes an element at the given index.
- Searching− Searches an element in the array using the given       index or the value.
- Sorting−Sort the array ascending order
- Update− Updates an element at the given index.


# Time Complexity Analysis of Array By - [Ue Kiao](https://iq.opengenus.org/author/ue/), Phd
*[Ue Kiao](https://iq.opengenus.org/author/ue/) is a Technical Author and Software Developer* <br>
*B.Sc in Computer Science at National Taiwan University* <br> 
*PhD in Algorithms at Tokyo Institute of Technology* <br> 
*Researcher at TaoBao*

In this article, we have presented the Time Complexity analysis of different operations in Array. It clears several misconceptions such that Time Complexity to access i-th element takes `O(1)` time but in reality, it takes `O(√N)` time. We have presented space complexity of array operations as well.

### Introduction to Array Data Structure
Array is a linear data structure where elements are arranged one after another. An array is denoted by a memory address M which is the memory address of the first element.

In this view, the memory address of ith element = `M + (i-1) * S`
where:

- M is the memory address of first element
- S is the size of each element.

Note: all elements of an array are of the same size.

Array comes in different dimensions like 2D array and 3D array. 2D arrays is an array where each element is a 1D array.

Every D-dimensional array is stored as a 1D array internally. Elements of D-dimensional array are arranged in a 1D array internally using two approaches:

- Row Major
- Column Major
In Row Major, each 1D row is placed sequentially one by one.
Similarly, in Column Major, each 1D column is placed sequentially one by one.

Based on this, you can find the memory address of a specific element instantly.

### Time Complexity Analysis of Array

From this [article](https://iq.opengenus.org/why-o1-time-does-not-exist/), we learnt that fetching an element at a specific memory address takes `O(√N)` time where N is the block of memory being read.

Once the block of memory is in RAM (Random Access Memory) accessing a specific element takes constant time because we can calculate its relative address in constant time.

Bringing the block of memory from external device to RAM takes `O(√N)` time. As array elements are contiguous in memory, this operation takes place only once. Hence, it is reasonable to assume the time complexity to access an element to be `O(1)`.

Over-writing an element at a specific index takes constant time `O(1)` because we need to access the specific index at the relative address and add new element. This is same as accessing an element.

Note: Even in this operation, we need to load the array from external device that consumes `O(√N)` time.

Inserting and deleting elements take linear time depending on the implementation. If we want to insert an element at a specific index, we need to skip all elements from that index to the right by one position. This takes linear time `O(N)`.

If we want to insert element at end of array, we can do it in constant time as we can keep track of length of array as a member attribute of array. This approach is taken by standard array implementation in Java.

Similar is the approach with delete operation in array.

The Time Complexity of different operations in an array is:

| Array Operation      | Real-Time Complexity | Assumed Time Complexity |
| ---------------      | -------------------- | ----------------------- |
| Access i-th element  | `O(√N)`                |  `O(1)`                   |
| Traverse all elements|	`O(N + √N)`	      |  `O(N)`                   |
| Override element at i-th index | `O(√N)`      |	 `O(1)`                   |
| Insert element E	   | `O(N + √N`	          |  `O(N)`                   |
| Delete element E	   | `O(N + √N)`	          |  `O(N)`                   |
  
### Space Complexity of Array

The Space Complexity of the above array operations is `O(1)`.

This is because we do not need extra space beyond a fixed number of variables.

For some operations, you may need extra space of the order of `O(N)`. For example, sorting an array using a sorting algorithm that is not in-place.

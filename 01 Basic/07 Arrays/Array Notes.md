# **1. What is an Array in Java?**
An **array** in Java is a **fixed-size, ordered collection of elements of the same data type** stored in contiguous memory.

Key points:
* Size is fixed after creation.
* Index starts from 0.
* Stores only one type of data (e.g., int[], String[], double[]).
* Arrays are objects in Java.

Example of declaration:
int[] numbers;

Example of creation:
numbers = new int[5];

Example of initialization:
int[] numbers = {10, 20, 30, 40, 50};

Access:
System.out.println(numbers[2]); // 30

---

# **2. Important Properties of Arrays**
* **length** – Returns size of array (not method; it’s a field).
numbers.length; // gives number of elements
  

* Array indexing:
  numbers[0]  // first element
  numbers[numbers.length - 1] // last element
---

# **3. Traversing Arrays**
Using for loop:
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

Using enhanced for loop:
for (int n : numbers) {
    System.out.println(n);
}

---

# **4. Common Operations on Arrays**
* Insert (by assigning value to index)
* Update (replace value at index)
* Delete (not possible directly—use ArrayList)
* Search (linear search or binary search)
* Sort

---

# **5. Array Related Methods (from java.util.Arrays)**
Below are the **most important array methods**, each with a one-line explanation.

Import:
import java.util.Arrays;

---

## **A. Printing Methods**

### 1. **Arrays.toString(array)**
Converts a one-dimensional array to a readable string.
System.out.println(Arrays.toString(numbers));

### 2. **Arrays.deepToString(array)**
Converts 2D or multi-dimensional array to a readable string.

---

## **B. Sorting and Searching**

### 3. **Arrays.sort(array)**
Sorts the array in ascending order.

### 4. **Arrays.sort(array, fromIndex, toIndex)**
Sorts only a specific portion of the array.

### 5. **Arrays.binarySearch(array, value)**
Searches for a value in a sorted array and returns its index.

---

## **C. Copying Arrays**

### 6. **Arrays.copyOf(array, newLength)**
Creates a new array by copying the original array up to given length.

### 7. **Arrays.copyOfRange(array, start, end)**
Copies elements between two indices (end is exclusive).

---

## **D. Comparison Methods**

### 8. **Arrays.equals(arr1, arr2)**
Checks if two arrays are equal (same length + same elements).

### 9. **Arrays.deepEquals(arr1, arr2)**
Checks equality of multidimensional arrays.

---

## **E. Filling Arrays**

### 10. **Arrays.fill(array, value)**
Fills entire array with a specific value.

### 11. **Arrays.fill(array, fromIndex, toIndex, value)**
Fills part of the array.

---

## **F. Parallel Operations (Java 8+)**

### 12. **Arrays.parallelSort(array)**
Sorts array faster using multiple threads.

### 13. **Arrays.parallelPrefix(array, operator)**
Performs cumulative operations on elements.

---

# **6. Working with Multi-Dimensional Arrays**
Declaration:
int[][] matrix = new int[3][3];

Initialization:
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

Access:
System.out.println(matrix[1][2]); // 6

Print using deepToString:
System.out.println(Arrays.deepToString(matrix));

---

# **7. Example Program Using Arrays and Methods**
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {50, 10, 40, 20, 30};

        System.out.println("Original: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 30);
        System.out.println("Index of 30: " + index);

        int[] copy = Arrays.copyOf(arr, 3);
        System.out.println("Copy: " + Arrays.toString(copy));

        Arrays.fill(arr, 100);
        System.out.println("After fill: " + Arrays.toString(arr));
    }
}

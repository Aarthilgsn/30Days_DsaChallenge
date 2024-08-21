# Move all zeroes to end of array 
## Description

The MoveZerosToEnd class provides a method to move all zeros in an array 
to the end while maintaining the order of non-zero elements.

## Approach
1. Two-Pointer Technique:
 - **Index Pointer (index):** This pointer tracks the position where the next non-zero element should be placed.
 - **Traverse the Array:** Iterate through the array using a loop. For each non-zero element encountered, place it at the position indicated by the index pointer and increment the index.
 - **Fill Zeros:** Once all elements have been processed, fill the remaining positions in the array (from index to the end) with zeros.

2. In-Place Operation:
 - The operation is performed directly on the input array without using any additional space, ensuring optimal memory usage.

## Time and Space Complexity
 - **Time Complexity:** O(n) - The array is traversed once, making the time complexity linear.
 - **Space Complexity:** O(1) - No additional space is used; the array is modified in place.

## Example Iteration
For an input array {3, 5, 0, 0, 4}:

 - **Initial State:** arr = [3, 5, 0, 0, 4], index = 0
 - **1st Iteration:** i = 0, arr[i] = 3 → Place 3 at arr[index], increment index → arr = [3, 5, 0, 0, 4], index = 1
 - **2nd Iteration:** i = 1, arr[i] = 5 → Place 5 at arr[index], increment index → arr = [3, 5, 0, 0, 4], index = 2
 - **3rd Iteration:** i = 2, arr[i] = 0 → No change, continue
 - **4th Iteration:** i = 3, arr[i] = 0 → No change, continue
 - **5th Iteration:** i = 4, arr[i] = 4 → Place 4 at arr[index], increment index → arr = [3, 5, 4, 0, 4], index = 3
 - **Final Step:** Fill remaining positions with zeros → arr = [3, 5, 4, 0, 0]

## Java Code
```bash
import java.util.*;

public class MoveZerosToEnd {
    public static void moveZerosToEnd(int[] arr, int n) {
        int index = 0; // Initialize the index pointer
        
        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i]; // Place the non-zero element at index
                index++;
            }
        }
        
        // Fill the remaining positions with zeros
        while (index < n) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array:");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            moveZerosToEnd(arr, n);

            System.out.println("Array after moving zeros to end:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
```

## Output
For the input array {3, 5, 0, 0, 4}, the output after moving zeros to the end will be:

```bash
Array after moving zeros to end:
3 5 4 0 0
```

This code efficiently moves all zeros to the end of the array while maintaining the order of non-zero elements. 
It does so in-place, ensuring optimal time and space complexity.


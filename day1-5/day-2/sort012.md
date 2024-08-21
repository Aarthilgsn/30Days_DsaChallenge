# Sort 0's,1's and 2's

## Description
The sort012 class provides a method to sort an array containing only 0s, 1s, and 2s 
using the Dutch National Flag Algorithm.

# Approach
 - Dutch National Flag Algorithm:
     - The array contains only 0s, 1s, and 2s. We use three pointers: low, mid, and high.
     - low: Tracks the position where the next 0 should be placed.
     - mid: Traverses the array.
     - high: Tracks the position where the next 2 should be placed.
     - As we traverse the array:
          - If arr[mid] == 0, we swap arr[mid] with arr[low], increment low and mid.
          - If arr[mid] == 1, we just increment mid.
          - If arr[mid] == 2, we swap arr[mid] with arr[high], decrement high.
     - The loop continues until mid surpasses high, ensuring all 0s are at the start, all 2s are at the end, and all 1s are in the middle.

## Time and Space Complexity
 - Time Complexity: O(n) - We only traverse the array once, making the time complexity linear.
 - Space Complexity: O(1) - The sorting is done in-place, so no additional space is required.

## Example Iteration
For an input array {0, 1, 2, 1, 0, 2, 1, 0}:

 - **Initial State:** arr = [0, 1, 2, 1, 0, 2, 1, 0], low = 0, mid = 0, high = 7
 - **1st Iteration:** mid = 0, arr[mid] = 0 → Swap arr[mid] with arr[low], increment low, mid → arr = [0, 1, 2, 1, 0, 2, 1, 0], low = 1, mid = 1
 - **2nd Iteration:** mid = 1, arr[mid] = 1 → Increment mid → arr = [0, 1, 2, 1, 0, 2, 1, 0], mid = 2
 - **3rd Iteration:** mid = 2, arr[mid] = 2 → Swap arr[mid] with arr[high], decrement high → arr = [0, 1, 0, 1, 0, 2, 1, 2], high = 6
 - **4th Iteration:** mid = 2, arr[mid] = 0 → Swap arr[mid] with arr[low], increment low, mid → arr = [0, 0, 1, 1, 0, 2, 1, 2], low = 2, mid = 3
 - **Final Steps:** Continue this process until mid surpasses high.

## Java Code

```bash
import java.util.*;
public class sort012 {
    public static void Sort012(int[] arr, int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array:");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the elements of the array (0, 1, 2):");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] < 0 || arr[i] > 2) {
                    System.out.println("Invalid input. Please enter only 0, 1, or 2.");
                    return;
                }
            }
            Sort012(arr, n);

            System.out.println("Array after sorting:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
}
```

## Output
For the input array {0, 1, 2, 1, 0, 2, 1, 0}, the output after sorting will be:

```bash
Array after sorting:
0 0 0 1 1 1 2 2
```

This code efficiently sorts the array using the Dutch National Flag Algorithm, ensuring optimal time and space complexity.

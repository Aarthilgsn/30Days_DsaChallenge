# MinMax Java Program

## Description

The **MinMax Java Program** is a utility that finds and displays the minimum and maximum values from a user-defined array of integers. 
This program is designed to help understand basic array operations and how to handle user input in Java. 
It demonstrates fundamental concepts such as loops, conditionals, and input/output handling in Java.

### **Features:**

- **Input Handling:** Prompts the user to enter the number of elements in the array and the array elements themselves.
- **Min and Max Calculation:** Iterates through the array to find the smallest and largest values.
- **Output:** Displays the minimum and maximum values to the user.

## Code

Below is the Java code for the MinMax program:

```java
import java.util.Scanner;

public class MinMax {
    void findMinMax(int n, int arr[]) {
        int min = arr[0], max = 0;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            MinMax m = new MinMax();
            m.findMinMax(n, arr);
        }
    }
}
```

# Example Execution
## Input

```bash
5
10 3 5 7 2
```

```bash
Minimum element: 2
Maximum element: 10
```

# Explanation

1.**Initialization:**
     - The program initializes min with the first element of the array and max with 0.
2.**Iterations:**
     - Iterates through the array to update min and max based on the current element.
3.**Output:**
     - Displays the smallest and largest values found in the array.

# Detailed Iteration for Example Input:

Given input array: [10, 3, 5, 7, 2]

- Iteration 1 (i = 0):
  - arr[0] = 10
  - min = Math.min(10, 10) = 10
  - max = Math.max(0, 10) = 10

- Iteration 2 (i = 1):
  - arr[1] = 3
  - min = Math.min(10, 3) = 3
  - max = Math.max(10, 3) = 10

- Iteration 3 (i = 2):
  - arr[2] = 5
  - min = Math.min(3, 5) = 3
  - max = Math.max(10, 5) = 10

- Iteration 4 (i = 3):
  - arr[3] = 7
  - min = Math.min(3, 7) = 3
  - max = Math.max(10, 7) = 10

- Iteration 5 (i = 4):
  - arr[4] = 2
  - min = Math.min(3, 2) = 2
  - max = Math.max(10, 2) = 10


##Output
```bash
Minimum element: 2
Maximum element: 10
```
# How to Run

1.**Compile the Code:**
To compile the Java program, use the following command:
```bash
javac MinMax.java
```
2.**Run the Program:**
After compilation, run the program using:
```bash
java MinMax
```
3.**Follow the Prompts:**
- Enter the number of elements.
- Input the elements of the array.

# Notes

- Ensure that the number of elements entered matches the number of array elements you provide.
- The program initializes min with the first element of the array and max with 0, which is suitable if the array contains non-negative integers. 
  For arrays with negative integers, you might want to initialize max with arr[0] as well.

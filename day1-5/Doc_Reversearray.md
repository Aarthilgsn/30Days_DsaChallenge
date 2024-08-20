# Reverse Array Java Program

## Description

The **Reverse Array Java Program** is a utility that reverses the order of elements in a user-defined array. It demonstrates handling user input, array manipulation, and output in Java.

### How the Program Works

1. **Prompt for Number of Elements:**
   - The program first asks you to input the number of elements in the array.

2. **Enter Array Elements:**
   - Next, it prompts you to enter the values of the array elements one by one.

3. **Reverse and Display Array:**
   - The program then reverses the order of the elements and prints them.

# Code

## Below is the Java code for the Reverse Array program:

```java
import java.util.Scanner;

public class ReverseArray {
    void reverse(int n, int arr[]) {
        System.out.println("Reversed elements are:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of elements:");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            ReverseArray revarr = new ReverseArray();
            revarr.reverse(n, arr);
        }
    }
}
```

# Example Execution
## Input

```bash
5
1 2 3 4 5
```

```bash
Reversed elements are:
5 4 3 2 1 
```

# Iterations
For the given example, the program processes the input as follows:

## Initialization:

- arr = [1, 2, 3, 4, 5]
- The loop will start from the last index (i = 4) and move to the first index (i = 0).

## Reverse Process:

- Iteration 1: i = 4 -> arr[4] = 5
- Iteration 2: i = 3 -> arr[3] = 4
- Iteration 3: i = 2 -> arr[2] = 3
- Iteration 4: i = 1 -> arr[1] = 2
- Iteration 5: i = 0 -> arr[0] = 1

# Output:

- Prints 5 4 3 2 1 as the reversed order of the array elements.

# How to Run

1.**Compile the Code:**
To compile the Java program, use the following command:
```bash
javac ReverseArray.java
```
2.**Run the Program:**
After compilation, run the program using:
```bash
java ReverseArray
```
3.**Follow the Prompts:**
- Enter the number of elements.
- Input the elements of the array.

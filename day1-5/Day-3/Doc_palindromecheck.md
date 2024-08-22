# Palindrome check

A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization). 
In other words, a palindrome remains unchanged when its characters are reversed.

## Examples:
"radar","level","civic","madam"

## Characteristics:
   - Symmetry: The sequence of characters is symmetrical, meaning the first half is a mirror image of the second half.
   - Reversible: It reads the same forwards and backwards.

1. Brute Force Method

## Description
This method uses the StringBuilder class to reverse the input string and then compares the reversed string with the original string to determine if it is a palindrome.

## Code

```bash
public class PalindromeCheckBruteForce {

    public static int isPalindrome(String S) {
        // Create a StringBuilder to reverse the string
        StringBuilder reversed = new StringBuilder(S);
        reversed.reverse(); // Reverse the string

        // Compare the original string with the reversed string
        if (S.equals(reversed.toString())) {
            return 1; // Palindrome
        } else {
            return 0; // Not a palindrome
        }
    }

    public static void main(String[] args) {
        // Prompt user for input and check for palindrome.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();
        scanner.close();

        System.out.println("Output: " + isPalindrome(userInput));
    }
}
```

## Approach
1. Reverse the String:
   - Use StringBuilder to reverse the input string.
2. Compare Strings:
   - Compare the reversed string with the original string.

## Time Complexity
  - O(n): Reversing the string and comparing it both operate in linear time, where n is the length of the string.
## Space Complexity
  - O(n): Additional space is required for storing the reversed string.

## Iteration
  - String Reversal: Each character in the string is visited once to reverse it.
  - String Comparison: Each character in the original and reversed strings is compared.

2. Optimized Two-Pointer Method

This method uses two pointers to compare characters from both ends of the string, moving towards the center. It efficiently checks for a palindrome without extra space for another string.

## Code

```bash
import java.util.Scanner;

public class PalindromeCheckTwoPointer {

    public static int isPalindrome(String S) {
        int left = 0;
        int right = S.length() - 1;

        // Iterate from both ends towards the center
        while (left < right) {
            if (S.charAt(left) != S.charAt(right)) {
                return 0; // Not a palindrome
            }
            left++;
            right--;
        }

        return 1; // Palindrome
    }

    public static void main(String[] args) {
        // Prompt user for input and check for palindrome.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();
        scanner.close();

        System.out.println("Output: " + isPalindrome(userInput));
    }
}
```

## Approach
1. Two-Pointer Technique:
   - Use two pointers: one starting from the beginning (left) and one from the end (right).
2. Compare Characters:
   - Compare characters pointed to by left and right.
   - Move the pointers towards the center.

## Time Complexity
   - O(n): Each character is compared once, where n is the length of the string.
## Space Complexity
   - O(1): No additional space is used beyond a few variables.

## Iteration Steps:
Comparing Characters with Two Pointers:
  - Input: "racecar"
  - Initialization:
      - left pointer starts at index 0 (first character).
      - right pointer starts at index 6 (last character).
  - Iteration:
      - Compare S.charAt(left) with S.charAt(right):
          - Iteration 1: Compare S.charAt(0) ('r') with S.charAt(6) ('r'). They match.
          - Iteration 2: Compare S.charAt(1) ('a') with S.charAt(5) ('a'). They match.
          - Iteration 3: Compare S.charAt(2) ('c') with S.charAt(4) ('c'). They match.
          - Iteration 4: Compare S.charAt(3) ('e') with S.charAt(3) ('e'). They match.
     - The pointers cross each other (left > right), and all comparisons were successful.
 - Output: 1 (palindrome)

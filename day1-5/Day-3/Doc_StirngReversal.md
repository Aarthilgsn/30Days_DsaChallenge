# Reverse String and Eliminate Duplicates

## Problem Statement
Given a string S, the goal is to reverse the string while eliminating any repeated characters and ignoring spaces. 
The output should contain each character only once, in the order they appear from right to left in the original string.

# Approach
1. **Iteration from End to Start:**

   - The string S is processed in reverse order, from the last character to the first.
   - This ensures that the first occurrence of any character in the reversed string is considered, while duplicates are ignored.

2. **Using HashSet to Track Seen Characters:**

     - A HashSet<Character> is used to keep track of characters that have already been encountered.
     - For each character in the string, we check if it is a space or has already been added to the result.
       If not, the character is appended to the result and added to the HashSet.

## What is a HashSet?
  - HashSet is a collection class in Java that implements the Set interface. It is part of the Java Collections Framework.
  - A HashSet is used to store unique elements, meaning it does not allow duplicates. It also does not maintain any particular order of the elements.
    For each character in the string, we check if it is a space or has already been added to the result.
    If not, the character is appended to the result and added to the HashSet.

## Why Use HashSet in This Code?
1. Preventing Duplicates:

   - The main purpose of the HashSet in this code is to keep track of characters that have already been added to the result string.
   - Before adding a character to the StringBuilder, the code checks if the character is already in the HashSet. If it is, the character is skipped.
     This ensures that each character appears only once in the final output.

2. Efficient Lookups:

   - HashSet provides constant-time performance for basic operations like add, remove, and contains, which are O(1) on average.
   - This efficiency is crucial in the code because it ensures that checking whether a character has already been seen does not slow down the process, even for long strings.

3. Space Efficiency:

   - The HashSet only stores the characters that have been encountered, which in the worst case is all unique characters of the input string.
   - Since the characters are stored without duplicates, the space used by the HashSet is proportional to the number of unique characters in the string, making it quite space-efficient.

4. Simple and Clear Logic:

   - Using a HashSet makes the code logic straightforward and easy to understand.
     The seen.add(ch) operation not only adds the character to the set but also helps in managing duplicates seamlessly.

## Example Scenario:
Consider the input string "GEEKS FOR GEEKS":

  - When processing the string from the end, the first unique character encountered is 'S', which is added to both the result and the HashSet.
  - The next character 'K' is also unique and gets added.
  - When the loop encounters 'E', it is added, but subsequent 'E' characters are skipped because 'E' is already in the HashSet.

This process continues until all unique characters are collected, and duplicates are effectively ignored.

3. **Building the Result String:**

## Why Using StringBuilder is Effective:

   - A StringBuilder is used to efficiently build the result string as characters are appended.
1. Efficiency in String Manipulation:

   - In Java, strings are immutable, meaning that every time you concatenate two strings using the + operator, a new string is created in memory.
     This can be inefficient, especially when concatenating inside loops.
   - StringBuilder, on the other hand, is mutable. It allows you to append characters or strings without creating a new object each time.
     This makes it much more memory-efficient and faster for operations that involve many string modifications.

2. Performance:

   - With StringBuilder, appending characters is typically an O(1) operation, meaning it takes constant time regardless of the number of characters added.
     This is because StringBuilder maintains an internal buffer that grows as needed.
   - Using + for string concatenation inside loops can lead to O(n^2) performance, as each concatenation creates a new string and copies the existing content.

3. Memory Usage:

   - Since StringBuilder doesn't create new string objects every time you append, it uses less memory. 
     This is particularly important in scenarios with large strings or many concatenation operations.

4. Readability and Convenience:

   - StringBuilder is easy to use and makes the code more readable when performing multiple string operations, like appending characters in this case.

## Code

```bash
import java.util.HashSet;
import java.util.Scanner;

public class ReverseStringEliminateDuplicates {
    
    public static String reverseAndEliminate(String S) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();
        
        // Iterate from the end of the string to the beginning
        for (int i = S.length() - 1; i >= 0; i--) {
            char ch = S.charAt(i);
            
            // Ignore spaces and check if the character is already seen
            if (ch != ' ' && !seen.contains(ch)) {
                result.append(ch); // Append the character if not seen
                seen.add(ch); // Mark the character as seen
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking input from the user.
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string.
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();
        
        // Call the function and print the result.
        System.out.println("Output: " + reverseAndEliminate(userInput));
        
        // Close the scanner.
        scanner.close();
    }
}
```

# Time Complexity
   - O(n): The algorithm processes each character in the string exactly once, where n is the length of the string S.
   - Checking if a character is in the HashSet or adding a new character to the HashSet both take constant time, O(1) on average.
   - Thus, the overall time complexity is linear with respect to the length of the string.

# Space Complexity
   - O(k): The space complexity is primarily determined by the HashSet, which stores at most k unique characters, where k is the number of unique non-space characters in the string.
   - Additionally, the StringBuilder also stores up to k characters.
   - The space complexity is therefore O(k), where k ≤ n.

# Iteration Details
   - Forward Loop: We iterate through the string in reverse, i.e., from the last character to the first.
   - Character Processing: For each character:
       - If the character is not a space and hasn't been encountered before, it is appended to the result.
       - The character is then marked as "seen" by adding it to the HashSet.

# Example Iteration

## Example Input
Input String: "GEEKS FOR GEEKS"

## Step-by-Step Iteration
1. Initial Setup:

   - result = "" (StringBuilder is empty)
   - seen = {} (HashSet is empty)

2. Iteration 1: (i = 14)

   - Character: 'S'
   -  Action: 'S' is not in seen and is not a space.
   - Result: Append 'S' to result → result = "S"
   - Seen: Add 'S' to seen → seen = {'S'}
3. Iteration 2: (i = 13)

  - Character: 'K'
  - Action: 'K' is not in seen and is not a space.
  - Result: Append 'K' to result → result = "SK"
  - Seen: Add 'K' to seen → seen = {'S', 'K'}

4. Iteration 3: (i = 12)

   - Character: 'E'
   - Action: 'E' is not in seen and is not a space.
   - Result: Append 'E' to result → result = "SKE"
   - Seen: Add 'E' to seen → seen = {'S', 'K', 'E'}
5. Iteration 4: (i = 11)

   - Character: 'E'
   - Action: 'E' is in seen, so it is skipped.
   - Result: No change → result = "SKE"
   - Iteration 5: (i = 10)

6. Character: 'G'
   - Action: 'G' is not in seen and is not a space.
   - Result: Append 'G' to result → result = "SKEG"
   - Seen: Add 'G' to seen → seen = {'S', 'K', 'E', 'G'}

7. Iteration 6: (i = 9)

   - Character: ' '
   - Action: Space is ignored.
   - Result: No change → result = "SKEG"
8. Iteration 7: (i = 8)

   - Character: 'R'
   - Action: 'R' is not in seen and is not a space.
   - Result: Append 'R' to result → result = "SKEGR"
   - Seen: Add 'R' to seen → seen = {'S', 'K', 'E', 'G', 'R'}
9. Iteration 8: (i = 7)

   - Character: 'O'
   - Action: 'O' is not in seen and is not a space.
   - Result: Append 'O' to result → result = "SKEGRO"
   - Seen: Add 'O' to seen → seen = {'S', 'K', 'E', 'G', 'R', 'O'}

10. Iteration 9: (i = 6)

   - Character: 'F'
   - Action: 'F' is not in seen and is not a space.
   - Result: Append 'F' to result → result = "SKEGROF"
   - Seen: Add 'F' to seen → seen = {'S', 'K', 'E', 'G', 'R', 'O', 'F'}
11. Iteration 10: (i = 5)

    - Character: ' '
    - Action: Space is ignored.
    - Result: No change → result = "SKEGROF"
12. Iteration 11: (i = 4)

    - Character: 'S'
    - Action: 'S' is in seen, so it is skipped.
    - Result: No change → result = "SKEGROF"

13. Iteration 12: (i = 3)

    - Character: 'K'
    - Action: 'K' is in seen, so it is skipped.
    - Result: No change → result = "SKEGROF"
14. Iteration 13: (i = 2)

    - Character: 'E'
    - Action: 'E' is in seen, so it is skipped.
    - Result: No change → result = "SKEGROF"
15. Iteration 14: (i = 1)

    - Character: 'E'
    - Action: 'E' is in seen, so it is skipped.
    - Result: No change → result = "SKEGROF"

16. Iteration 15: (i = 0)

   - Character: 'G'
   - Action: 'G' is in seen, so it is skipped.
   - Result: No change → result = "SKEGROF"
## Final Output
   - After processing all characters, the final output is "SKEGROF".

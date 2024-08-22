//palindrome check optimized code two-pointer technique

import java.util.*;

public class palindromeoptimized {

    public static int isPalindrome(String S) {
        int left = 0;
        int right = S.length() - 1;


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
        try(Scanner scanner = new Scanner(System.in)){
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Output: " + isPalindrome(input));
    }
}

}

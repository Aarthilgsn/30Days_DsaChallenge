//Palindrome check brute force method

import java.util.*;
public class palindromebetter{

    public static int isPalindrome(String S) {
        StringBuilder reversed = new StringBuilder(S);
        reversed.reverse(); 

        if (S.equals(reversed.toString())) {
            return 1; // Palindrome
        } else {
            return 0; // Not a palindrome
        }
    }

    public static void main(String[] args) {
        
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Output: " + isPalindrome(input));
        }
    }
}


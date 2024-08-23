//Longest common prefix of strings-Brute force method

import java.util.*;

public class longestcommonprefixbetter {
    
        public static String longestCommonPrefix(String[] arr) {
            if (arr == null || arr.length == 0) return "-1";
    
            String prefix = arr[0];
            for (int i = 1; i < arr.length; i++) {
                while (arr[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) return "-1";
                }
            }
            return prefix;
        }
    
        public static void main(String[] args) {
            try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of strings:");
            int n = sc.nextInt();
            sc.nextLine();  // Consume the newline character
            String[] arr = new String[n];
            System.out.println("Enter the strings:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLine();
            }
    
            String result = longestCommonPrefix(arr);
            System.out.println("Longest Common Prefix: " + result);
        }
        
    }
    
}
    

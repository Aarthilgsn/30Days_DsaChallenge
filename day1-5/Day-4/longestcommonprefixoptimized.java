//Longest common prefix optimized code

import java.util.*;

public class longestcommonprefixoptimized {
    public static String longestCommonPrefixOptimized(String[] arr) {
        if (arr == null || arr.length == 0) return "-1";

        int minLen = findMinLength(arr);
        int low = 1, high = minLen;

        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(arr, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        String prefix = arr[0].substring(0, (low + high) / 2);
        return prefix.isEmpty() ? "-1" : prefix;
    }

    private static int findMinLength(String[] arr) {
        int minLen = arr[0].length();
        for (String str : arr) {
            minLen = Math.min(minLen, str.length());
        }
        return minLen;
    }

    private static boolean isCommonPrefix(String[] arr, int len) {
        String prefix = arr[0].substring(0, len);
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].startsWith(prefix)) {
                return false;
            }
        }
        return true;
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

        String result = longestCommonPrefixOptimized(arr);
        System.out.println("Longest Common Prefix: " + result);
        }
    
    }

}


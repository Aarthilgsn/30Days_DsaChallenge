
//count and say-Run length encoding(RLE)

import java.util.*;
public class countandsay {
    public static String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = getNextSequence(result);
        }
        return result;
    }

    private static String getNextSequence(String s) {
        StringBuilder nextSequence = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                nextSequence.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }

        nextSequence.append(count).append(s.charAt(s.length() - 1));
        return nextSequence.toString();
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Count and Say sequence is: " + countAndSay(n));
    }
}

}
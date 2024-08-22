//String Reverse and eliminate duplicates

import java.util.HashSet;
import java.util.Scanner;

public class Stringreversal {
    public static String reverseandeliminate(String S){
        StringBuilder result=new StringBuilder();
        HashSet<Character> seen=new HashSet<>();

        for(int i=S.length()-1;i>=0;i--){
            char ch=S.charAt(i);

            if(ch!=' ' && !seen.contains(ch)){
                result.append(ch);
                seen.add(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a String:");
            String input=sc.nextLine();

            System.out.println("Output:"+reverseandeliminate(input));

        }
    }
}

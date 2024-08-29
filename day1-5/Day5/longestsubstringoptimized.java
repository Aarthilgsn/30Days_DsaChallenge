//Longest substring without repeating character - optimized 
//Using Sliding window approach with Two pointers and Hashset

import java.util.*;
import java.util.HashSet;

public class longestsubstringoptimized {
    public static int lengthoflongestsubstring(String s){
        HashSet<Character> set=new HashSet<>();
        int maxlen=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter a String:");
        String st=sc.nextLine();
        int result=lengthoflongestsubstring(st);
        System.out.println("Length of the longest substring without repeating characters is:"+result);
        }

    }
}

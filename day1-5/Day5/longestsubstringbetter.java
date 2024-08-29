//Longest substring without repeating character - Brute force method

import java.util.*;

public class longestsubstringbetter{
    //check if all characters in the substring are unique
    public static boolean unique(String s,int start,int end){
        HashSet<Character> set=new HashSet<>();
        for(int i=start;i<end;i++){
            char c=s.charAt(i);
            if(set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }

    // Method to find the length of the longest substring without repeating characters
    public static int lengthoflongestsubstring(String s){
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(unique(s,j,i)){
                    maxlen=Math.max(maxlen,j-i);
                }
            }
        }
        return maxlen;
    }
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter a String:");
        String st=sc.nextLine();
        int result=lengthoflongestsubstring(st);
        System.out.println("length of the longest substring without repeating character is:"+result);
        }
    }
}

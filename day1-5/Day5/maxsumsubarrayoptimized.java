//Max sum subarray of size k - optimized 

import java.util.*;

public class maxsumsubarrayoptimized {
    public static int maxsumsubarray(int N,int[] arr,int k){
        int maxsum=0;
        int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        maxsum=windowsum;
        for(int i=k;i<N;i++){
            windowsum+=arr[i]-arr[i-k];
            maxsum=Math.max(maxsum,windowsum);
        }
        return maxsum;
    }
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the array size:");
            int n=sc.nextInt();
            System.out.println("Enter the subarray size:");
            int k=sc.nextInt();

            System.out.println("Enter the array elements:");
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int result=maxsumsubarray(n, arr, k);
            System.out.println("Maximum sum subarray is:"+result);
        }
    }
}

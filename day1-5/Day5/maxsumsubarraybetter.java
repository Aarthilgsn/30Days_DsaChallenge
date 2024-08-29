//max sum subarray of size k - Brute force method

import java.util.*;

public class maxsumsubarraybetter {
    public static int maxsumsubarray(int k,int[] arr,int N){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<=N-k;i++){
            int currentsum=0;
        
        for(int j=i;j<i+k;j++){
            currentsum+=arr[j];
        }
        maxsum=Math.max(maxsum,currentsum);
    }
    return maxsum;

    }
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the array size:");
            int n=sc.nextInt();
            System.out.println("Enter the subarray size:");
            int k=sc.nextInt();

            if(k>n){
                System.out.println("k should be smaller than n");
                return;
            }
            System.out.println("Enter the array elements:");
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int result=maxsumsubarray(k, arr, n);
            System.out.println("The maximum sum of subarray is:"+result);

        }
    }
}

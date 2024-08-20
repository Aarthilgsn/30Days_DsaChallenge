//MinMax in an array

import java.util.Scanner;

public class minmax {
    void Minmax(int n,int arr[]){
        int min=arr[0],max=0;
        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        System.out.println("Minimum element:"+min);
        System.out.println("Maximum element:"+max);
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the element:");
            int n=sc.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter the array elements:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            minmax m=new minmax();
            m.Minmax(n,arr);
        }
    }
}

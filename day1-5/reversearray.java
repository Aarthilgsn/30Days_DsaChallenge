 //Reverse an array

import java.util.Scanner;

public class reversearray {
    void reverse (int n,int arr[]){
        System.out.println("Reversed elements are:");
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        try(Scanner scanner=new Scanner (System.in)){
        System.out.println("Enter the number of elements:");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        reversearray revarr=new reversearray();
        revarr.reverse(n,arr);
    }
        
  }
}

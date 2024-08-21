//Move all zeroes to end of array

import java.util.*;

public class movezerostoend {
    public static void Movezerostoend(int[] arr,int n){
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<n){
            arr[index]=0;
            index++;
        }
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Movezerostoend(arr, n);
        System.out.println("Array after moving zeros to end:");
          for (int num : arr) {
                System.out.print(num + " ");
            }
        }

    }
}

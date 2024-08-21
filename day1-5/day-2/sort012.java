//Sort 0s, 1s and 2s

import java.util.*;

public class sort012 {
    public static void Sort012(int[] arr,int n){
        int low =0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;

            }else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number of elements in the array:");
            int n=sc.nextInt();
            int[] arr=new int[n];

            System.out.println("Enter the elements of the array(0,1,2):");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();

                if (arr[i] < 0 || arr[i] > 2) {
                    System.out.println("Invalid input. Please enter only 0, 1, or 2.");
                    return;
            }
        }
        Sort012(arr,n);

        System.out.println("Array after sorting:");
        for(int num : arr){
            System.out.print(num+" ");
        }

    }
}

}

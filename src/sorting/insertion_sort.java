package sorting;

import java.util.Arrays;



public class insertion_sort {
    public static void main(String[] args) {
        int[] arr={4,10,6,8,2,9};
        insertsort(arr);
        System.out.println(Arrays.toString(arr));

    }
   static void insertsort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while (j>0&&arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}














//here first element is at its correct position then we check the correct position of other elements and then we place the
//elements at there correct position
//the array is divided into two parts i.e sorted and unsorted intitially first element is sorted then we keep on checking the element
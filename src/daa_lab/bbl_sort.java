package daa_lab;

import java.util.Arrays;
import java.util.Scanner;

public class bbl_sort {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Entr the element of the array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
                   swap(arr[j+1],arr[j]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int i, int i1) {
        int temp;
        temp=i;
        i=i1;
        i1=temp;
    }

}

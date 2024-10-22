package daa_lab;

import java.util.Scanner;
public class binary_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the element to search");
        int key=sc.nextInt();
        int ans=binary_search(arr,key);
        System.out.println(ans);
    }public static int binary_search(int[]arr,int key){
        int start=0;
        int end= arr.length-1;
        //int mid=(start+end)/2;
        while (start <= end) {
            int m = start + (end - start) / 2;
            if (arr[m] == key)
            { System.out.println("found and index is");
                return m;}
            if (arr[m] < key)
                end = m + 1;
            else
                end = m - 1;
        }
        return -1;
    }
}

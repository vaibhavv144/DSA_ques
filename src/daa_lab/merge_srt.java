package daa_lab;

import java.util.Arrays;

public class merge_srt {
    public static void main(String[] args) {
        int[]arr={2,4,1,44,66,7,3};
        int n= arr.length;
        int s=0;
        int e=arr.length-1;
        merge_sort(arr,s,e);
        System.out.println(Arrays.toString(arr));
    }
    static void merge_sort(int[] arr, int s, int e) {
        if(s>=e){
            return;
        }
        int q=s+(e-s)/2;
        merge_sort(arr,s,q);
        merge_sort(arr,q+1,e);
        merger(arr,s,q,e);
    }

     static void merger(int[] arr, int s, int q, int e) {
        int[]left=new int[q+1-s];
        int[]right=new int[e-q];
         int i=0,j=0,k=s;
        for (int l = 0; l < left.length; l++) {
            left[l]=arr[s+l];
        }
        for (int m = 0; m < right.length; m++) {
            right[m]=arr[q+1+m];
        }
        while(i< left.length&&j< right.length){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else {
                arr[k++]=right[j++];
            }
        }
        while(i< left.length){
            arr[k++]=left[i++];
        }
        while(j< right.length){
            arr[k++]=right[j++];
        }
    }
}

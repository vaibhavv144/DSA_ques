package sorting;

import java.util.Arrays;

public class
merge_sort {
    public static void main(String[] args) {
        int []arr={1,223,42,44,2,22,78,9};
         mrg_sort(arr,0,7);
        System.out.println(Arrays.toString(arr));


    }
    static void mrg_sort(int[] arr,int s,int e){
        if(s>=e){
            return;
        }
        int m=s+(e-s)/2;
        mrg_sort(arr,s,m);
        mrg_sort(arr,m+1,e);
        merge(arr,s,m,e);
    }
    static void merge(int[]arr,int s,int mid,int e){
        int n1=mid+1-s;
        int n2=e-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i=0,j=0,k=s;
        for (int l = 0; l < n1; l++) {
            left[l]=arr[k];
            k++;
        }
        for (int l = 0; l <n2 ; l++) {
            right[l]=arr[k];
            k++;
        }
      //  i=0;j=0;k=s;
        k=s;
        while (i<n1&&j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                k++;
                i++;
            }else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1)
            arr[k++]=left[i++];
        while (j<n2)
            arr[k++]=right[j++];
    }
}

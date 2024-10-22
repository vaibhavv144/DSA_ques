package immersion_DSA;

import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {

        int[]arr={1,2,3};
        Permutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Permutation(int[]arr){
        int p=-1;
        for(int i= arr.length -2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            Reverse(arr,p+1,arr.length-1);
        }
        int q=-1;
        for(int i= arr.length -1;i>=0;i--){
            if(arr[p]<arr[i]){
                q=i;
                break;
            }
        }
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        Reverse(arr,p+1,arr.length-1);
    }

    public static void Reverse(int[]arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}

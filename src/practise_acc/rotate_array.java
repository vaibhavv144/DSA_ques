package practise_acc;

import java.util.Arrays;

public class rotate_array {
    public static void main(String[] args) {
        int[]arr={1,3,5,7,9};
        int n=arr.length;
        int d=3;
        int j=0;
        int[]ans=new int[arr.length];

       for(int i=0;i<n-d;i++){
           ans[i]=arr[i+d];
       }
       for(int i=0;i<d;i++){
           ans[n-d+i]=arr[i];
       }


        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
}

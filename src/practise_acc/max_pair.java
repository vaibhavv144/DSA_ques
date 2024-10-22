package practise_acc;

import java.util.Arrays;

public class max_pair {
    public static void main(String[] args) {
        int[]arr={11,1,2,8,10,11,15,7};
//
        int[]result=solve(arr);
        System.out.println(Arrays.toString(result));


    }
    public static int[] solve(int[]arr){
        int[]bst_pair=null;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j< arr.length;j++){
                if(arr[i]+arr[j]==18){
                    if(arr[j]>arr[i]){
                        bst_pair=new int[]{arr[j],arr[i]};
                    }

                }
            }
        }
        return bst_pair;
    }
}

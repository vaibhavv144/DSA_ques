package immersion_DSA;

import java.util.Arrays;

public class Divisible_subarray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,6};
        long ans=Count_Subarray(arr);
        System.out.println(ans);
    }

    public  static  long Count_Subarray(int[] arr){
        long sum=0;
        long []freq=new long[arr.length];
        freq[0]=1;
        int n= arr.length;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
          //  System.out.println(sum);
            int idx=(int)(sum%n);
            if(idx<0){
                idx=idx+n;
            }
            freq[idx]++;

        }
        System.out.println(Arrays.toString(freq));
        long ans=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=2){
                long p=freq[i];
                ans=ans+(p*(p-1))/2;
            }
        }
        return ans;

    }
}

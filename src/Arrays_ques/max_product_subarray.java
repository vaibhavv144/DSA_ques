package Arrays_ques;

public class max_product_subarray {
    public static void main(String[] args) {

        //brute force will be generating all the subarray
        //we need 3 loops to generate all the subarrays
        int[]arr={2,3,-2,4};
        int n= arr.length;
        int max=Integer.MIN_VALUE;

        //n^3
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                int pro=1;
//                for(int k=i;k<j;k++){
//                    pro=pro*arr[k];
//                }
//                max=Math.max(pro,max);
//            }
//        }

        //n^2
//        for(int i=0;i<n;i++){
//            int prodct=1;
//            for(int j=i;j<n;j++){
//                prodct=prodct*arr[j];
//                max=Math.max(max,prodct);
//            }
//        }

        //most optimized approach
        //we should take prefix and postfix sum
        int prefix=1;
        int suffix=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            prefix=prefix*arr[i];
            suffix=suffix*arr[n-1-i];
            ans=Math.max(ans,Math.max(prefix,suffix));

        }

        System.out.println(ans);

    }
}

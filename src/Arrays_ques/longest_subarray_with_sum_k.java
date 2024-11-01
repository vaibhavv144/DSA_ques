package Arrays_ques;

import java.util.HashMap;

public class longest_subarray_with_sum_k {
    public static void main(String[] args) {


        int[]arr={1,2,3,1,1,1,1,34,4};
        int k=3;

        //one better approach is using hash map usme hm log add karenge phr chk karenge naya nbr - given sum agr phle se
        //present h to subarray mil gyaa

//        HashMap<Integer,Integer>hp=new HashMap<>();
//        int sum=0;
//        int max_l=0;
//        for(int i=0;i< arr.length;i++){
//
//            sum=sum+arr[i];
//            if(sum==k){
//                max_l=Math.max(max_l,i+1);
//
//            }
//            int rem=sum-k;
//            if(hp.containsKey(rem)){
//                int len=i-hp.get(rem);
//                max_l=Math.max(max_l,len);
//            }
//
//            if(!hp.containsKey(sum)){
//                hp.put(sum,i);
//            }
//        }
//        System.out.println(max_l);

        //for positive array we have a better optimized approach i.e we use to pointer approach in this we do
        //MOVE if EXCEED the given sum REMOVE from back then again move

        int p1=0;
        int p2=0;
        int max_len=0;
        int sum=arr[0];
        while(p2< arr.length){
                while(p1<=p2&&sum>k){
                        sum=sum-arr[p1];
                        p1++;
                }

                if(sum==k){
                    max_len=Math.max(max_len,p2-p1+1);
                }
                 p2++;
                if(p2< arr.length){
                    sum=sum+arr[p2];
                }
        }
        System.out.println(max_len);

    }
}

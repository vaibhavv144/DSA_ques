package Arrays_ques;

import java.util.Arrays;

public class rearrange_according_to_sign {
    public static void main(String[] args) {
        int[]arr={3,1,-2,-5,2,-4};

        //you have to alternativly put + and - signed nbr
        //2 extra array lo usme put krdo ek me negative ek me positive ar phr dono array s element utha k alternativly put kr do
        int N= arr.length;

        //brute force
//        int[]pos=new int[N/2];
//        int[]neg=new int[N/2];
//        int j=0;
//        for(int i=0;i< N;i++){
//            if(arr[i]<0){
//                neg[j]=arr[i];
//                j++;
//            }
//        }
//        int l=0;
//        for(int i=0;i< N;i++){
//            if(arr[i]>0){
//                pos[l]=arr[i];
//                l++;
//            }
//        }
//        for (int i = 0; i < N/2; i++) {
//            arr[2*i]=pos[i];
//            arr[2*i+1]=neg[i];
//        }

        int[]ans=new int[N];
        //optimized: two pointr lo ar direct array m traverse krte krte putkrdo
        int odd=1;
        int even=0;
        for(int i=0;i<N;i++){
            if(arr[i]<0){
                ans[odd]=arr[i];
                odd=odd+2;
            }
            if(arr[i]>0){
                ans[even]=arr[i];
                even=even+2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}

package practise_acc;

import java.util.*;

public class sort_merge_array {
    public static void main(String[] args) {
        int[]arr1={3,1,1,2};
        int[]arr2={4,3,3,2,1};
        int[]ans=new int[arr1.length+ arr2.length];
        Arrays.sort(ans);
        Set<Integer> st=new TreeSet<>();
        for(int a:ans){
            st.add(a);
        }
//        if(ans.length%2!=0){
//            System.out.println(ans[ans.length/2]);
//        }


    }
}

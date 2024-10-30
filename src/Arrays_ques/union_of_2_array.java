package Arrays_ques;

import java.util.Arrays;
import java.util.HashSet;

public class union_of_2_array {
    public static void main(String[] args) {

        int[]arr1= {1, 1, 2, 2, 2, 44};
        int [] arr2 = {2, 2, 4, 4};

        HashSet<Integer>hs=new HashSet();

        for(int i=0;i< arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        int n=hs.size();
        int[]ans=new int[n];
        int x=0;
        for(int a:hs){

            ans[x]=a;
            x++;
        }
        System.out.println(Arrays.toString(ans));

    }
}

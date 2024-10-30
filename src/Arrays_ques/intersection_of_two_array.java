package Arrays_ques;

import java.util.ArrayList;

public class intersection_of_two_array {
    public static void main(String[] args) {

        int[]arr1= {1, 2, 2, 3, 3, 4,5,6};
        int [] arr2 = {2,3, 3, 5, 6,6,7};

        ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<Integer>al=new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            al.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(al.contains(arr2[i])){
                ans.add(arr2[i]);
            }
        }
        System.out.println(ans);
    }
}

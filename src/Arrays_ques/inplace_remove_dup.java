package Arrays_ques;

import java.util.Arrays;

public class inplace_remove_dup {
    public static void main(String[] args) {

        //leetcodee:26

        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        //BRUTE FORCE
        //in brute force we can use set and add all elements in set then calculate size of set this will be size of non duplicate
        //elements and then traverse the arrays and fill the elements in array from set

        //OPTIMIZED (use 2 pointer)
        int j=0;

        for(int i=1;i< arr.length;i++){
            if(arr[j]!=arr[i]){
                arr[j+1]=arr[i];
                j++;

            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(j+1);
    }
}

package Arrays_ques;

import java.util.Arrays;

public class left_rotate {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};

        //store first element and then run the loop for i=1 to n-1 and plce every ele 1 stp behind

        int temp=arr[0];

        for (int i=1;i< arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}

package window_sliding;

import java.util.LinkedList;
import java.util.Queue;

public class   constant_window {
    public static void main(String[] args) {

        //ques:find max avrg of 7 elements in the given array ie find max avrg of 7 elements in the array
        //as the size seven is given so this is a fixed size window sliding
        int[]nums={7,4,5,8,8,3,9,8,7,6};
        int k=7;
        double sum=0;

        // adding elements in the window of given size
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }


        double ans=sum/k;
        // now here we are checking if the original seven element sum is less or more than the next elemts
        for(int j=k;j<nums.length;j++){
            //window growth adding elemt aftr the seven element
            sum=sum+nums[j];
            //window shrink deletting the first element of the window
            sum=sum-nums[j-k];
            double s=sum/k;
            ans=Math.max(ans,s);

        }

        System.out.println(ans);
    }
    }


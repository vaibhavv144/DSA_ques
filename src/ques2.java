import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ques2 {

    public static void main(String[] args) {
        int []nums = {10,2};
        System.out.println(largestNumber(nums));
    }
    public static  String largestNumber(int[] nums) {
        ArrayList<Integer>al=new ArrayList<>();
       // String ans="";
        for(int i=0;i<nums.length;i++){
            if(nums[i]/10>=1){
                while(nums[i]/10>0){
                    int temp=nums[i]%10;
                    al.add(temp);
                    nums[i]=nums[i]/10;
                }
            }
            else{
                al.add(nums[i]);
            }
        }
        Collections.sort(al, Comparator.reverseOrder());

        StringBuilder ans = new StringBuilder();
        for(var a:al){
            ans=ans.append(a);
        }
        return ans.toString();
    }
}


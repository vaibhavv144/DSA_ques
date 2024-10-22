package recurssion;

import java.util.ArrayList;
import java.util.List;

public class keypad_leetcode {
    static String[]arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
       // List<String> list=new ArrayList<>();
        String ques="12";
        combination(ques,"");
    }
    public static void combination(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return ;
        }
        char c=ques.charAt(0);
        String rem_string=arr[c-48];
        for (int i = 0; i < rem_string.length(); i++) {
            combination(ques.substring(1),ans+rem_string.charAt(i));
        }
    }
}

package practise_acc;

import java.util.Stack;

public class reverse_using_stack {
    public static void main(String[] args) {
        String str="vaibhav";
        Stack <Character> st=new Stack<>();
        int i=0;

        for (int j = 0; j < str.length(); j++) {
            st.push(str.charAt(j));
        }
        String ans="";
        while(!st.isEmpty()){
            ans=ans+st.pop();
        }
        System.out.println(ans);
    }
}

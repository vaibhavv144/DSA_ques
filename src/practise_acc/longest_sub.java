package practise_acc;

import java.util.HashSet;

public class longest_sub {
    public static void main(String[] args) {
        String s="abcabcd";
        int n=s.length();

        int max=0;

        HashSet<Character>st=new HashSet<>();
        int left=0;
        for(int right=0;right<n;right++){
           // Character c=s.charAt(right);
           if(!st.contains(s.charAt(right))){
               st.add(s.charAt(right));
               max=Math.max(max,right-left+1);
           }
           else{
               while(st.contains(s.charAt(right))){
                   st.remove(s.charAt(left));
                   left++;
               }
               st.add(s.charAt(right));
           }

        }
        System.out.println(max);


    }


}

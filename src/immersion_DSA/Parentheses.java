package immersion_DSA;

import java.util.ArrayList;
import java.util.List;

public class Parentheses {

    public static void main(String[] args) {
        int n=3;
        List<String>ll=new ArrayList<>();
        Paranthesis(n,0,0,"",ll);
        System.out.println(ll);


    }

    public static void Paranthesis(int n,int open, int close,String ans,List<String>ll){

        if(open==n&&close==n){
            ll.add(ans);
            return;
        }
        if(open>n||close>open){
            return;
        }
        Paranthesis(n,open+1,close,ans+" (",ll);
        Paranthesis(n,open,close+1,ans+" )",ll);




    }
}

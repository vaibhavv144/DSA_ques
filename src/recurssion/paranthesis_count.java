package recurssion;

import java.util.ArrayList;
import java.util.List;

public class paranthesis_count {
    public static void main(String[] args) {
        int n=3;

        List<String> arr=new ArrayList<>();
        count(n,0,0,"",arr);
        System.out.println(arr);

    }

    public static void count(int n, int opening, int closing, String ans, List<String> arr){

        if(n==opening&&n==closing){
            arr.add(ans);
            return;
        }

        if(n>opening){
            count(n,opening+1,closing,ans+"(",arr);
        }
        if(opening>closing){
            count(n,opening,closing+1,ans+")",arr);
        }



    }
}

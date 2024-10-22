package practise_ques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class fasinating_nbr {
    public static void main(String[] args) {
        int n = 192;
        char[] digits = String.valueOf(n).toCharArray();
        int m=2*n;
        int p=3*n;
        String s1= String.valueOf(n);
        String s2= String.valueOf(m);
        String s3= String.valueOf(p);
        String r=s1+s2+s3;
       /* char[] chars = r.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
        if(sorted.compareTo("123456789")==0){
            System.out.println("yes");
        }
        else System.out.println("no");*/
        char[] arr= r.toCharArray();
        Arrays.sort(arr);
        int f=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if(arr[i]!=i+1){
              break;
            }
            f++;

      //  System.out.println("no");
          //  f++;
        }
        System.out.println(f);
        if(f==9){
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}

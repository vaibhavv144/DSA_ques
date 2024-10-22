package immersion_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // int ct=0;
        int ans=0;

        for (int i = 0; i < n; i++) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int ct=0;
            if(a==1){
                ct++;
            }
            if(b==1){
                ct++;
            }
            if(c==1){
                ct++;
            }

            if(ct>=2){
                ans++;
            }


        }



        System.out.println(ans);




    }

}

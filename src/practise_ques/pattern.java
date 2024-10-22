package practise_ques;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        String num="51230100";
        System.out.println( findans(num));


    } public static String findans(String num){

        int l=0;
        int a=num.length();
    /*   Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       for (int i = 0; i < a; i++) {
           for (int j = 0; j < a; j++) {
               if (i == j) {
                   System.out.print("*" + " ");
               } else {
                   System.out.print(j + " ");
               }
           }
           System.out.println();
       }*/
        int c=0;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='0'){
                c++;
            }
            else break;


        }//System.out.println(num.substring(0,l));
        l=a-c;

        System.out.println(l);
        return num.substring(0,l);
    }
    }




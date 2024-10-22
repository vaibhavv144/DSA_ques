package cp_classroom;

import java.util.Scanner;
//take a string "abc" and its combination now chk if by one pass is other combination can be made "abc"

public class numbr_of_pass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s=sc.nextLine();
            if(isSortable(s)){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
    public static boolean isSortable(String s) {
        if(s.charAt(1)=='a') return true;
        if(s.charAt(0)=='b'|s.charAt(2)=='b') return true;
        if(s.charAt(1)=='c') return true;
        return false;
    }
}

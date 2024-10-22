package practise_acc;

import java.util.HashSet;
import java.util.Locale;

public class string_rev {
    public static void main(String[] args) {
        String str="Hellozzz Vaibhav is my name";
        String res="";
        str=str.toLowerCase();

//        for(int i=str.length()-1;i>=0;i--){
//            res=res+str.charAt(i);
//
//        }
//        HashSet<Character>hs=new HashSet<>();
//        for(int i=0;i<str.length();i++){
//            if(!hs.contains(str.charAt(i))){
//                hs.add(str.charAt(i));
//            }
//
//        }
//        for(char a:hs){
//            res=res+a;
//        }
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        str=sb.toString();


        System.out.println(str);
    }
}

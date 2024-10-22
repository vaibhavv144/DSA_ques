package Hash_Map;

import java.util.HashMap;

public class anagram {
    public static void main(String[] args) {
        String c="abc";
        String b="cabb";
        HashMap<Character,Integer>a1=chk_freq(c);
        HashMap<Character,Integer>a2=chk_freq(b);
        if(c.length()!=b.length()) {
            System.out.println("not anagram");

        }
        else if(a1.equals(a2)){
            System.out.println("anagram");
        }
        else System.out.println("not an anagram");

    }

    public static HashMap<Character,Integer> chk_freq(String s){
        HashMap<Character,Integer> hp=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if(!hp.containsKey(s.charAt(i))){
                hp.put(s.charAt(i),1);
            }
            else {
                int a=hp.get(s.charAt(i));
                hp.put(s.charAt(i),a+1);
            }
        }
            return hp;
    }

}

package Hash_Map;

import java.util.HashMap;

public class isomorphic_string {
    public static void main(String[] args) {

        String s = "bar";
        String t = "foo";
        
        HashMap<Character,Character> hp=new HashMap<>();


        for (int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            Character p=t.charAt(i);
            if(hp.containsKey(c)){
                   Character a= hp.get(c);
                   if(a!=p){
                       System.out.println("no");
                       break;
                   } else if (hp.containsValue(p)){
                       System.out.println("no");
                       break;
                   }
                   else {
                       hp.put(c,p);
                   }
            }
        }
        System.out.println("yes");

    }
}

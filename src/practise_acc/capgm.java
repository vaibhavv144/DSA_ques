package practise_acc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class capgm {
    public static void main(String[] args) {
        String str = "facetious";
        HashMap<Character, Integer> hp = new HashMap<>();
        int f=0;
        for (int i = 0; i < str.length(); i++) {
            if (!hp.containsKey(str.charAt(i))) {
                f=f+2;
                hp.put(str.charAt(i), 1);
            } else {
                f=f+1;
                hp.put(str.charAt(i), hp.get(str.charAt(i)) + 1);
            }
        }

//            for(Map.Entry<Character,Integer>mp:hp.entrySet()){
//                if(mp.getValue()<2){
//                    f=f+2;
//                }
//                else{
//                    f=f+1;
//                }
//            }
        System.out.println(f);


    }
}

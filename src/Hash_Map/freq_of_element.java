package Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class freq_of_element {
    public static void main(String[] args) {

        int[]arr={1,22,3,4,1,3,4,6,8,8,1,6,3,7};
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(var key: arr){
            if(!mp.containsKey(key)){
                mp.put(key,1);
            }
            else{
                mp.put(key,mp.get(key)+1);
            }
        }
        System.out.println(mp.entrySet());

        int max_freq=0;
        int element=-1;

        for(Map.Entry<Integer, Integer> e:mp.entrySet()){
                if(e.getValue()>max_freq){
                    max_freq=e.getValue();
                    element=e.getKey();
                }
        }

        System.out.println(max_freq);
        System.out.println(element);
    }
}

package Hash_Map;

import java.util.HashMap;

public class diff_method {
    public static void main(String[] args) {
        HashMap <String ,Integer> map=new HashMap<>();
        //adding elements in hashmap
        map.put("vaibhav",21);
        map.put("aditya",20);
        map.put("aviral",27);
        map.put("raghav",31);

        //getting value of a key from hash map
        System.out.println(map.get("vaibhav")); //it will give 21 as output

        //removing key from hash map
        System.out.println(map.remove("aviral"));

        //check if key exist in map or not
        System.out.println(map.containsKey("vaibhav"));//it will give true

        //adding new element only if that key is not present previously
        if(!map.containsKey("yash")){
                map.put("yash",28);
        }
        //or
        map.putIfAbsent("abc",25);

        //get all keys from hash map
        System.out.println(map.keySet());

        //get all values from hash map
        System.out.println(map.values());

        //get all entries from hash map
        System.out.println(map.entrySet());

        //traversing all entries in hash map

        for(var key:map.keySet()){
            System.out.printf("key is %s and value is %d",key,map.get(key));
            System.out.println();
        }

    }
}

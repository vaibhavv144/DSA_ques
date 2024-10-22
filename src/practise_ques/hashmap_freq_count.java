package practise_ques;

import java.util.Arrays;
import java.util.HashMap;

public class hashmap_freq_count {

    public static void main(String[] args) {
           int[] arr = {1, 2, 3, 4, 1, 2, 3, 5, 1, 2, 3}; // example array

            // create a HashMap to store the frequency of each element
            HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

            // loop through the array and update the frequency count in the HashMap
            for (int i = 0; i < arr.length; i++) {
                int key = arr[i];
                if (freqMap.containsKey(key)) {
                    freqMap.put(key, freqMap.get(key) + 1);
                } else {
                    freqMap.put(key, 1);
                }
            }

            // print out the frequency count for each element in the array
            for (int key : freqMap.keySet()) {
                System.out.println(key + ": " + freqMap.get(key));
                if (freqMap.get(key) >= 2) {
                    System.out.println("no");


                }}}}




















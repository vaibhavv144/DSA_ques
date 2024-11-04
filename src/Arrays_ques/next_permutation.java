package Arrays_ques;

import java.util.ArrayList;
import java.util.Collections;

public class next_permutation {
    public static void main(String[] args) {
        int[]arr={2,1,5,4,3,0,0};
        //you have to tell the next permutation which will occur after this
        //basic brute force is to use recussion to generate all the possible permutation and then use linear search to search
        //and then just put it but this will take n!*n! time complexity so we will use a better solution

        ArrayList<Integer>al=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        int n=al.size();
        // Step 1: Find the break point:
        int ind = -1; // break point
        //n-2 se loop chalega kyuki n-2 se hi koi element milegaaa
        for (int i = n - 2; i >= 0; i--) {
            if (al.get(i) < al.get(i + 1)) {
                // index i is the break point
                ind = i;
                break;
            }
        }
        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            Collections.reverse(al);
            System.out.println(al);;
        }
        // Step 2: Find the next greater element
        //         and swap it with arr[ind]:

        for (int i = n - 1; i > ind; i--) {
            if (al.get(i) > al.get(ind)) {
                int tmp = al.get(i);
                al.set(i, al.get(ind));
                al.set(ind, tmp);
                break;
            }
        }
        // Step 3: reverse the right half:
        ArrayList<Integer> sublist = (ArrayList<Integer>) al.subList(ind + 1, n);
        Collections.reverse(sublist);
        System.out.println(sublist);


    }
}

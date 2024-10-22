package practise_ques;

import java.util.HashMap;
import java.util.Map;

public class count_pair {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, -1};
        int K = 6;
        int c=0;
//        for(int i=0;i< arr.length;i++){
//            for(int j=i+1;j< arr.length;j++)
//            if(arr[i]+arr[j]==K){
//                c++;
//            }
//        }
//        System.out.println(c);

        HashMap<Integer,Integer> hp=new HashMap<>();

        for(int i:arr){
            if(!hp.containsKey(i)){
                hp.put(i,1);
            }
            else{
                hp.put(i,hp.get(i)+1);
            }
        }

        for(int i=0;i< arr.length;i++){
            if(hp.containsKey(K-arr[i])){
                c=c+hp.get(K-arr[i]);
                hp.put(arr[i],hp.get(arr[i])-1);
                if(arr[i]==K-arr[i]){
                    c--;
                }
            }

        }
        //System.out.println(c);
        for(Map.Entry<Integer,Integer>e: hp.entrySet()){
            System.out.println(e.getKey()+"->"+e.getValue());
        }

    }
}

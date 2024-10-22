package recurssion;

public class permutation_of_coin_value {
    //in this question we have a target value and have infinite supply of given coins now we have to find all different ways in which we can
    //reach the target using all different coins
    public static void main(String[] args) {
        int[]coins={2,3,5,6};
        int amount=10;
        different_permutation(coins,amount,"");
        System.out.println("");
        different_combination(coins,amount,"",0);
    }
     public static void   different_permutation(int[]arr,int target,String ans){
        if (target==0){
            System.out.println(ans);
            return;
        }
         for (int i = 0; i <arr.length ; i++) {
             if(target>=arr[i]){
                 different_permutation(arr,target-arr[i],ans+arr[i]);
             }
         }
     }
     /*if in the same question we have to find only the combination i.e. no repeated should be there then we use two condition
     if there is infinite supply then we take the loop from same index and
      when there is not an infinite supply then we run loop from i+1 */
     public static void   different_combination(int[]arr,int target,String ans,int index){
         if (target==0){
             System.out.println(ans);
             return;
         }
         for (int i = index; i <arr.length ; i++) {
             if(target>=arr[i]){
                 different_combination(arr,target-arr[i],ans+arr[i],i);
             }
         }
     }

}
package Arrays_ques;

public class max_consecutive_1 {
    public static void main(String[] args) {
        int[]arr={ 1,1,0,1,1,1,0,0};

        int max=0;
        int maxi=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==1){
                maxi++;
                max=Math.max(max,maxi);

            }
            if(arr[i]==0){
                maxi=0;
            }
        }
        System.out.println(max);
    }
}

package Arrays_ques;

public class missing_nbr_in_array {
    public static void main(String[] args) {
        int N = 5;
        int[]array = {1,2,4,5};

        //best approach to do this ques is by using XOR but isko sum nikaal k bhi kr skte h
        int sum=(N*(N+1))/2;
        int given_sum=0;
        for(int a:array){
            given_sum=given_sum+a;
        }


        System.out.println(sum-given_sum);


    }
}

package Arrays_ques;

public class leaders_in_array {
    public static void main(String[] args) {
        int[]arr={10,22,12,3,0,6};

        //in leaders of array you need to return all the elements where right side of that element is smaller than the currnt element

        //right most element will always be leader

        //optimized approach take a pointer from last of the array and take its value in "MAX" then compare it

        int max=Integer.MIN_VALUE;

        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]>max){
                System.out.println(arr[i]);
                max=arr[i];
            }
        }

    }
}

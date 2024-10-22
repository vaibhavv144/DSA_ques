package cp_classroom;

public class maxSubArraySum_window_sliding {
    public static void main(String[] args) {

        int arr[]={2,7,3,5,8,1};
        int k=3;
        int ans= maxSubArraySum(arr,k);
        System.out.println(ans);

    }
    public static int maxSubArraySum(int[]arr,int n){
        int maxSum=0;
        int windowSum=0;
        int start=0;
        for (int end=0;end<arr.length;end++){
            windowSum=windowSum+arr[end];
            if(end>=n-1){
               maxSum=Math.max(maxSum,windowSum);
               windowSum=windowSum-arr[start];
               start++;
            }
        }
        return maxSum;
    }


}

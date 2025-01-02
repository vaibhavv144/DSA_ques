package binary_search;

public class coco_eating_banana {
    public static void main(String[] args) {
        /*Problem Statement: A monkey is given ‘n’ piles of bananas, whereas the 'ith' pile has ‘a[i]’ bananas.
        An integer ‘h’ is also given, which denotes the time (in hours) for all the bananas to be eaten.
        Each hour, the monkey chooses a non-empty pile of bananas and eats ‘k’ bananas. If the pile contains less than ‘k’ bananas,
        then the monkey consumes all the bananas and won’t eat any more bananas in that hour.
        Find the minimum number of bananas ‘k’ to eat per hour so that the monkey can eat all the bananas within ‘h’ hours.*/
        int[]arr={7, 15, 6, 3};
        int h=8;
        //max of the array means itna hi max kele khaa skte h to range 1 se max of array tk hogi
       // int ans=final_ans(arr,h);
        //binary search
        int ans=minimumRateToEatBananas(arr,h);
        System.out.println(ans);
    }
    //optimizd binary search approach
    public static int minimumRateToEatBananas(int[] v, int h) {
        int low = 1, high = max(v);
        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = total_time(v, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    //brute force
    public static int final_ans(int[]arr,int h){
        int maxi=max(arr);
        //ye 1 se max value tk hi banana kha skte h usme s max value niklegi
        for(int i=1;i<=maxi;i++){
            int req_time=total_time(arr,i);
            if(req_time<=h){
                return i;
            }
        }
        return -1;
    }

    public static int max(int[]arr){
        int max=Integer.MIN_VALUE;

        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int total_time(int[]arr,int hour){
        int totaltime=0;
        for(int i=0;i< arr.length;i++){
            totaltime=totaltime+Math.ceilDiv(arr[i],hour);
        }
        return totaltime;
    }



}

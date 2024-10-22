package immersion_DSA.dp;

import javax.print.attribute.standard.Media;
import java.util.Arrays;

//LIS,min cost to
public class house_robber {
    public static void main(String[] args) {
            int[]arr={5,3,1,7,2};
        int[] dp = new int[arr.length];
             Arrays.fill(dp, -1);

    }

    public static int robber(int[]arr,int i,int[]dp){
        if(arr.length<=i){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob=arr[i]+robber(arr,i+2,dp);
        int notrob=robber(arr,i+1,dp);
        return Math.max(rob,notrob);
    }
    public static int RobberBU(int[] arr) {

        int[] dp = new int[arr.length];

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < dp.length; i++) {
            int rob = arr[i] + dp[i - 2];
            int Do_ntrob = dp[i - 1];
            dp[i] = Math.max(rob, Do_ntrob);
        }
        return dp[arr.length - 1];

    }
}

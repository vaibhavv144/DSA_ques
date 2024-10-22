package immersion_DSA.dp;

public class fib {
    public static void main(String[] args) {
        int n=6;
        int[]dp=new int[n+1];
        System.out.println(fibb(n,dp));
    }
    public static  int fibb(int n,int[] dp){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int f1=fibb(n-1,dp);
        int f2=fibb(n-2,dp);
        return f1+f2;
    }

    public static int fibBU(int n){
        int[]dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return -1;
    }
}

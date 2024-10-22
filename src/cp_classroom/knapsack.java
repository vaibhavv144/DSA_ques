package cp_classroom;
public class knapsack {
    public static void main(String[] args) {
        int sum=4;
        int[]s={1,2,3};
        int n=s.length;
        int ans=knapSack(sum,s,n);
        System.out.println(ans);
    }
     public static int knapSack(int sum,int[]s,int n){
        int[] []dp=new int[n+1][sum+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(i==0){
                    dp[i][j]=0;
                }
                if(j==0){
                    dp[i][j]=1;
                }
            }
        }
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <sum+1 ; j++) {
                if(s[i-1]<=j){
                    dp[i][j]=dp[i][j-s[i-1]]+dp[i-1][j];
                } else {
                    dp[i][j]=dp[i-1][j];
                }
            }

        }
        return dp[n][sum];
    }
}

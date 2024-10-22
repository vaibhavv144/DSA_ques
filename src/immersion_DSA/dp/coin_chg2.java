package immersion_DSA.dp;

public class coin_chg2 {
    public static void main(String[] args) {

        int[]coin={1,2,3};
        int amount=5;
        System.out.println(change_2(coin,amount,0));


    }

    public static int CoinChangesBU(int[] coin, int amount) {
        int[][] dp = new int[amount + 1][coin.length + 1];
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 1;
        }

        for (int am = 1; am < dp.length; am++) {
            for (int i = 1; i < dp[0].length; i++) {
                int inc = 0;
                int exc = 0;
                if (am >= coin[i - 1]) {
                    inc = dp[am - coin[i - 1]][i];
                }
                exc = dp[am][i - 1];
                dp[am][i] = inc + exc;

            }
        }

        return dp[amount][coin.length];

    }

    public  static  int change_2(int[]coin,int amount,int i){
        if(amount==0){
            return 0;
        }
        int inc=0;
        int exc=0;
        if(amount>=coin[i]){
            inc=change_2(coin,amount-coin[i],i);
        }
        exc=change_2(coin,amount,i+1);
        return inc+exc;
    }

}

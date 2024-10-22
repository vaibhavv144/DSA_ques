package immersion_DSA.dp;

public class valentine_magic {
    public static void main(String[] args) {

    }

    public static int Min_Diff(int[]boys,int[]girls,int i,int j){
        if(i== boys.length){
            return 0;
        }
        if(j== girls.length){
            return 999999;
        }

        int pair = Math.abs(boys[i] - girls[j]) + Min_Diff(boys, girls, i + 1, j + 1);
        int No_Pair = Min_Diff(boys, girls, i, j + 1);
        return Math.min(pair, No_Pair);

    }
}

package dp;

public class subset_sum {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        boolean a = sbset_sum(arr, sum);
        System.out.println(a);
    }
    public static boolean sbset_sum(int[] arr, int s) {
        boolean[][] t = new boolean[s + 1][arr.length + 1];
        for (int i = 0; i < s + 1; i++) {
            for (int j = 0; j < arr.length + 1; j++) {
                if (i == 0) {
                    t[i][j] = false;
                }
                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }
        for (int i = 1; i < s + 1; i++) {
            for (int j = 1; j < arr.length + 1; j++) {
                if (j >= arr[i - 1]) {
                    //t[i][j] = [i][j - arr[i - 1]] || t[i - 1][j];
                } else t[i][j] = t[i - 1][j];
            }
        }
        return t[s][arr.length];
    }

}

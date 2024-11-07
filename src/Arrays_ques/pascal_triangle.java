package Arrays_ques;

public class pascal_triangle {
    public static void main(String[] args) {

        //pascal triangle look like this
         /*      1
              1    1
            1    2    1
           1  3    3   1
          1  4   6    4  1     */

        //brute force for this is we have to calculate nCr here
        //1st type In this case, we are given the row number r and the column number c, and we need to find out the element at position (r,c).
        //formula for calculating the element at NcR is (n-1)C(r-1)
        int n = 5;
        int r = 3;
        int ans = nCr(n - 1, r - 1);
        System.out.println(ans);

    }

    public static int nCr(int n, int r) {

//        5C3=n!/(n-r)!*r!  ==>  5*4*3*2*1/(3*2*1)*(2*1) ==> 5*4/2*1 ==>   5/1*4/2
        //nCr calculate krne m jitni place r jaaega utni place c jaaega jaise  r=3 h to 3 2 1 yahi 3 palce gya to n 5*4*3 3 ple jaaega

        int res = 1;
        for (int i = 0; i < r; i++) {
            //ye r times cahlegaa
            res = res * (n - i);
            res = res / (i + 1);

        }

        return res;
    }

}


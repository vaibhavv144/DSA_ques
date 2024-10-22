//package immersion_DSA.dp;
//
//public class distinct_sub {
//    public static void main(String[] args) {
//
//        String s = "babgbag";
//        String t = "bag";
//        System.out.println(Subseq(s,t,0,0));
//
//    }
//
//    public static int Subseq(String s,String t,int i,int j){
//        int inc=0;
//        int exc=0;
////        if(s.length()==0||t.length()==0){
////            return 0;
////        }
//        if (i == t.length()) {
//            return 1;
//        }
//        if (j == s.length()) {
//            return 0;
//        }
//        if(s.charAt(i)==t.charAt(j)){
//            inc=Subseq(s,t,i+1,j+1);
//        }
//
//        exc=Subseq(s,t,i,j+1);
//
//        return inc+exc;
//    }
//}
package immersion_DSA.dp;

public class distinct_sub {
    public static void main(String[] args) {
        String s = "babgbag";
        String t = "bag";
        System.out.println(Subseq(s, t, 0, 0));
    }

    public static int Subseq(String s, String t, int i, int j) {
        int inc = 0;
        int exc = 0;

        if (j == t.length()) { // t is fully matched
            return 1;
        }
        if (i == s.length()) { // s is exhausted
            return 0;
        }

        if (s.charAt(i) == t.charAt(j)) {
            inc = Subseq(s, t, i + 1, j + 1); // include current character in subsequence
        }

        exc = Subseq(s, t, i + 1, j); // exclude current character from subsequence

        return inc + exc;
    }
}


package recurssion;

public class coin_toss {
    public static void main(String[] args) {
        int n=2;
        coin_outcome(n,"");
    }
    public static void coin_outcome(int n,String s){

        if(n==0) {
            System.out.println(s);
            return;
        }
        if(s.length()==0||s.charAt(s.length()-1)!='H')
        { coin_outcome(n-1,s+"H");
        }
        coin_outcome(n-1,s+"T");




    }
}

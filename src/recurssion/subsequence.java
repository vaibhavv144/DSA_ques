package recurssion;

public class subsequence {
    //if we have to calculate the count as well then we declare a static variable
    static int c=0;
    public static void main(String[] args) {
        String s="abc";
        String ans="";
        subseq_ans(s,ans);
        System.out.println(c);

    }
    public static void subseq_ans(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            c++;
            return;
        }
        char c=ques.charAt(0);
        subseq_ans(ques.substring(1),ans);
        subseq_ans(ques.substring(1),ans+c);
    }
}

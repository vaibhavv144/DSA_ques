package recurssion;

public class permutation_of_string {
    public static void main(String[] args) {
        String ques="abc";
        String ans="";
        permutation(ques,ans);
    }
    public static void permutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            String an=ques.substring(0,i)+ques.substring(i+1);
            permutation(an,ans+ch);
        }

    }
}

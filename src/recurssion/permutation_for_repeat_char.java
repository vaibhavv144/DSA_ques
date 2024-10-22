package recurssion;

public class permutation_for_repeat_char {
    public static void main(String[] args) {
        String ques="abca";
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
            boolean flag=true;
            for (int j=i+1;j<ques.length();j++){
                if(ch==ques.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if (flag==true){
                String an=ques.substring(0,i)+ques.substring(i+1);
                permutation(an,ans+ch);
            }

        }

    }}

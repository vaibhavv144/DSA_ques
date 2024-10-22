package recurssion;

public class string_divison {
    //in this question we will print all the possible ways in which we can divide any given string but order will be same
    public static void main(String[] args) {
        String ques="nitin";
        String ans="";
        print_ans(ques,ans);
        pallindrome_string(ques);

    }

    public static void print_ans(String ques,String ans) {
        if (ques.length()==0){
            System.out.println(ans);
            //return;
        }
            for (int i=1;i<=ques.length();i++){
                print_ans(ques.substring(i),ans+ques.substring(0,i)+" |");
            }

    }
    public static boolean pallindrome_string(String ques){

        int i=0;
        int j=ques.length()-1;
        while (i<j){
            if (ques.charAt(i)!=ques.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }


}

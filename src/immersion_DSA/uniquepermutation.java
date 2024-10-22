package immersion_DSA;

public class uniquepermutation {

        public static void main(String[] args) {
            String str="abca";
            Print(str,"");
        }
        public  static void Print(String ques,String ans){
            if(ques.length()==0){
                System.out.println(ans);
                return;
            }
            for (int i = 0; i < ques.length(); i++) {
                char ch=ques.charAt(i);
                String s1=ques.substring(0,i);
                String s2=ques.substring(i+1);
                if(hasChar(ch,s2)==false){
                    Print(s1+s2,ans+ch);
                }
            }
        }
        public static boolean hasChar(char ch,String str){
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)==ch){
                    return true;
                }
            }
            return false;
        }
    }


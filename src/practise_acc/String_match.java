package practise_acc;

public class String_match {
    public static void main(String[] args) {
        String s1="Ta**nt";
        String s2="Talett";
        int j=0;
        for (int i = 0; i <s1.length() ; i++) {
            Character c=s1.charAt(j);
            Character c1=s2.charAt(j);
            if(c==c1){
                j++;
            }
            else if(c=='*'){
                j++;
            }
            else{
                System.out.println("false");
            }
        }
    }
}

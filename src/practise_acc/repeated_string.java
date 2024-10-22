package practise_acc;

public class repeated_string {
    public static void main(String[] args) {
        String str="abc";
        String ans=str;
        int n=3;//output == "abcabcabc"

        while(n>1){
            str=str+ans;
            n--;
        }

        System.out.println(str);

    }
}

package practise_acc;

public class string_pallindrome {
    public static void main(String[] args) {
        String str= "namans";
        int s=0;
        int l=str.length()-1;
        int f=0;
        while(l>=s){
            if(str.charAt(l)!=str.charAt(s)){
                f=1;
                System.out.println("Not a pallindrome");
                break;

            }
            s++;
            l--;
        }
        if(f==0){
            System.out.println("Pallindrome");
        }

    }
}

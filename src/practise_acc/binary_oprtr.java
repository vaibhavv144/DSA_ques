package practise_acc;

public class binary_oprtr {
    public static void main(String[] args) {
        String str="1C0C1C1A0B1";
       char[]arr= str.toCharArray();
       int res=arr[0]-'0';
        for (int i = 1; i < arr.length; i=i+2) {

            char op=arr[i];
            int op2=arr[i+1]-'0';
            if(op=='A'){
                res=res&op2;
            } else if (op=='B') {
                res=res|op2;
            } else if (op=='C') {
                res=res^op2;
            }
        }
        System.out.println(res);
    }
}

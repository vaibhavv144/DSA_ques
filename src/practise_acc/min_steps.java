package practise_acc;

public class min_steps {
    public static void main(String[] args) {
        int n=51;

        if(n==1){
            System.out.println(0);
        }
        if(n==2){
            System.out.println(1);
        }
        if(n==3){
            System.out.println(2);
        }

        else{
            if(n%2==0){
                System.out.println(2);
            }
            else {
                System.out.println(3);
            }
        }
    }
}

package practise_acc;

public class sum_of_prime {
    public static void main(String[] args) {
        int n=10;
        int sum=0;
        for(int i=2;i<n;i++){
            if(prime(i)){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }

    public static boolean prime(int x){
        for(int i=2;i<x;i++){
            if(x%i==0) return false;
        }
        return true;
    }
}

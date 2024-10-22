package practise_acc;

public class magical {
    public static void main(String[] args) {
        int n=5;
        int c=0;
        for(int i=1;i<=n;i++){
            int sum=0;
            int temp=i;
            while(temp>0){
                if((temp&1)==1){
                    sum+=2;
                    temp=temp>>1;
                }
                else{
                    sum+=1;
                    temp=temp>>1;
                }
            }
            if(sum%2!=0){
               c++;
            }
        }
        System.out.println(c);
    }
}

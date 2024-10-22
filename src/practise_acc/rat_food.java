package practise_acc;

public class rat_food {
    public static void main(String[] args) {
        int r= 7;
        int unit= 2;
        int n=8;
        int []arr= {2, 8, 3, 5, 7, 4, 1, 2};

        int ans=r*unit;
        int sum=0;
        int temp=0;
        for(int i=0;i<n;i++){
            if(sum<=ans){
                sum+=arr[i];
            }
            else{
                temp=i;
                break;
            }
        }
        System.out.println(temp);
    }
}

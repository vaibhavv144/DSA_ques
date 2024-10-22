package practise_acc;

public class peak {
    public static void main(String[] args) {
        int[]arr={5,3,2,1};

        int p1=0;
        int p2=1;
        if(arr.length<=2){
            System.out.println(Math.max(arr[p1],arr[p2]));
        }


        for(int i=0;i< arr.length;i++){
            if(arr[p1]>arr[p2]){
                System.out.println(arr[p1]);
                break;
            }
            else{
                p1++;
                p2++;
            }
        }

    }
}

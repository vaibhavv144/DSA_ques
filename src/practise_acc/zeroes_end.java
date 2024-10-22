package practise_acc;

public class zeroes_end {
    public static void main(String[] args) {
        int[]arr={1 ,2 ,0 ,0 ,0 ,3 ,6};
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        for(int i=index;i< arr.length;i++){
            arr[i]=0;
        }



        for(int a:arr){
            System.out.print(a);
        }
    }
}

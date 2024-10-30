package Arrays_ques;

import java.util.Arrays;

public class move_zeroes_to_end {
    public static void main(String[] args) {
        int[]arr={1,5,0,2,0,1,0,3,12};
        //phle ye chk kro ki phla 0 kaha h phr uske baad loop chalaao uske aage se ar jaha jaha 0 mile swap krdo

        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        for(int k=j+1;k< arr.length;k++){
            if(arr[k]!=0){
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

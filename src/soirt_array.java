import java.util.Arrays;

public class soirt_array {
    public static void main(String[] args) {
        int[]arr={2,33,4,55,6,77,1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }System.out.println(Arrays.toString(arr));
    }

}

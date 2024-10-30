package Arrays_ques;

import java.util.Arrays;

public class left_rotate_d_places {
    public static void main(String[] args) {

        int array[] = {1,2,3,4,5,6,7};
        int d=3;
        //we have to rotate it by d places so first we will chk d=d%size bcz agr size k barabar rotate krna h to same hi aajaaega
        int n=array.length;
        d=d%n;
        //use baad bass reverse krna h 3 baar
        reverse(array,0,d-1);
        reverse(array,d,n-1);
        reverse(array,0,n-1);

        System.out.println(Arrays.toString(array));


    }

    public static void reverse(int[]arr,int s,int e){
        while(e>=s){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}

package binary_search;

public class peak_element {
    public static void main(String[] args) {
        //Given an array of length N. Peak element is defined as the element greater than both of its neighbors.
        // Formally, if 'arr[i]' is the peak element, 'arr[i - 1]' < 'arr[i]' and 'arr[i + 1]' < 'arr[i]'.

        int[]arr={1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        int n= arr.length;
        for(int i=0;i< n;i++){
            //for first and last element we will chk nothing
            if((i==0||arr[i-1]<arr[i])&&(i==n-1||arr[i]>arr[i+1])){
                System.out.println(arr[i]);
            }
        }
    }
}

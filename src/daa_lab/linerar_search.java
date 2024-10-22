package daa_lab;

import java.util.Scanner;

public class linerar_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int key= sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                System.out.println("yes");
                break;
            }

        }
    }
}

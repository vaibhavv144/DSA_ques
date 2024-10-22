package immersion_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Aggresive_cows {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nos=sc.nextInt();//nbr of stall
        int noc=sc.nextInt();//nbr of cows
        int[]stall=new int[nos];
        int t= sc.nextInt();
        while (t>0){
        for(int i=0;i<stall.length;i++){
            stall[i]= sc.nextInt();
        }
        Arrays.sort(stall);
        System.out.println(largest_minimum(stall,noc));
        }
    }
    public static int largest_minimum(int[]stall,int noc){
        int l=0;
        int h=stall[stall.length-1] -stall[0];//9-1
        int ans=0;
        while (l<=h){
            int mid=(l+h)/2;
            if(isitsafe(stall,noc,mid)){
                ans=mid;
                l=mid+1;

            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }

    private static boolean isitsafe(int[] stall, int noc, int mid) {
                int pos=stall[0];
                int cow=1;
        for (int i = 1; i <stall.length ; i++) {
            if(stall[i]-pos>=mid){
                cow++;
                pos=stall[i];
            }
            if(cow==noc){
                return true;
            }

        }
        return false;
    }
}

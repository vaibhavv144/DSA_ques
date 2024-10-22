package cp_classroom;

public class cdfrc_898 {
    //codefrc 898 div 4
    public static void main(String[] args) {

        int[]cost = {1,2,5};
        int amnt=5;
        int i=0;
        int ans=clb(cost,amnt,0);
        System.out.println(ans);


    }
    public static  int clb(int[]arr,int amnt,int i) {

        if(i==arr.length){
            return 0;
        }
        if (amnt == 0) {
            return 1;

        }
        int ans1=0;
        int ans2=0;
        if(amnt>=arr[i]){
             ans1 = clb(arr,amnt-arr[i],i);
        }

        ans2=clb(arr,amnt,i+1);

        return ans1+ans2;

    }
}


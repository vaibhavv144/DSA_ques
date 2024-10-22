package recurssion;
//ques says that you have to find different ways to reach end if we can take only 1,2,3 steps at once
public class nbr_of_steps_to_reach_target {
    public static void main(String[] args) {
        int  n=4;
        System.out.println(nbr_of_step(0,n," "));
    }
    public static int nbr_of_step(int start,int end,String ans){
        if(start==end){
            System.out.println(ans);
            return 1;
        }
        if (start>end){
            return 0;
        }
      /*  int one=   nbr_of_step(start+1,end,ans+1);
        int two=   nbr_of_step(start+2,end,ans+3);
        int three= nbr_of_step(start+3,end,ans+3);
        return one+two+three;*/

        //recurssive call using loop
        int  count=0;
        for (int i=1;i<=3;i++){
            count=count+nbr_of_step(start+i,end,ans+i);
        }
            return count;
    }
}

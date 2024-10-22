package recurssion;
//here a matrix is given and we are starting from (0,0) and we have to reach the target by going only Vertical and Horizontal
public class maze_problem {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        /*int s=0;
        int e=0;*/
        //String ans="";
        steps_req(m-1,n-1,0,0,"");
    }
    public static void steps_req(int m,int n,int start,int end,String ans ){
        if(start==m&&end==n){
            System.out.println(ans+" ");
            return;
        }
        if(start>m||end>n){
            return;
        }

        steps_req(m,n,start+1,end,ans+"H");
        steps_req(m,n,start,end+1,ans+"V");

    }

}

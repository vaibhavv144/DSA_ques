package immersion_DSA.dp;

public class min_ops {
    public static void main(String[] args) {

    }

    public static int Min(String s,String t,int i,int j){
        int ans=0;
        if(s.charAt(i)==t.charAt(j)){
            ans=Min(s,t,i+1,j+1);
        }
        else{
            int d=Min(s,t,i+1,j);
            int insert=Min(s,t,i,j+1);
            int replace=Min(s,t,i+1,j+1);

            ans=Math.min(insert,Math.min(d,replace));
        }
        return ans;
    }
}

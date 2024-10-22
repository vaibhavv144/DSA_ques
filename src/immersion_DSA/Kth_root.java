package immersion_DSA;

public class Kth_root {
    public static void main(String[] args) {
        int n=127;
        int k=3;
        int ans=KthRoot(n,k);
        System.out.println(ans);

    }
    public static int KthRoot(int n,int k){
        int l=1;
        int h=n;
        int ans=0;
        while(h>=l){
            int m=(l+h)/2;
            if(Math.pow(m,k)<=n){
                ans=m;
                l=m+1;
            }
            else{
                h=m-1;
            }
        }
        return ans;
    }
}

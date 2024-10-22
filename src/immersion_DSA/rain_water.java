package immersion_DSA;

public class rain_water {
    public static void main(String[] args) {
        int[]arr={4,2,0,3,2,5};
        int as=TrappingWater(arr);
        System.out.println(as);

    }

    public static int TrappingWater(int []arr){
        int[]left=new int[arr.length];
        int[]right=new int[arr.length];
        int n= arr.length;

        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }

        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }

        int ans=0;

        for(int i=0;i<n;i++){
            ans=ans+Math.min(left[i],right[i])-arr[i];

        }
        return ans;
    }
}

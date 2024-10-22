package practise_acc;

import java.util.Arrays;

public class maq {
    public static void main(String[] args) {
        String a="bac";
        String b="ddd";
        int k=3;
        int f=0;

        int[]arr1=new int[a.length()];
        int[]arr2=new int[a.length()];

        for(int i=0;i< arr1.length;i++){
            arr1[i]=a.charAt(i)-'a';
        }
        for(int i=0;i< arr2.length;i++){
            arr2[i]=b.charAt(i)-'a';
        }

        for(int i=0;i< arr1.length;i++){
            for(int j=1;j<=k;j++){
                if(arr1[i]+k==arr2[i]){
                    f++;

                }
            }
        }
        if(f==a.length()){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
    }
}

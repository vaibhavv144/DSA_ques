package pattern;

public class pattern2 {
    public static void main(String[] args) {
        int n=5;
        int star=1;
        int gap=n-1;
        int row=1;
        //int i=1;
        while(row<=n){
            int j=1;
            while(j<=gap){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while (k<=star){
                System.out.print("*"+" ");
                k++;
            }
            System.out.println();
            star++;
            gap--;
            row++;
            //i++;
        }
    }
}

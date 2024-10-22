package recurssion;
//lexcico number series are the series where we check the number character wise like 11 is greater than 100
public class lexcico_numbrer {
    public static void main(String[] args) {
        int n=0;//starting
        int m=1000;//ending
        printlexcico(n,m);
    }

    public static void printlexcico(int current, int end) {
        if(current>end){
            return;
        }
        System.out.println(current);
        int i=0;
        if(current==0){
            i=1;
        }
        for (;i<=9;i++) {
            printlexcico(current*10+i,end);

        }

    }
}

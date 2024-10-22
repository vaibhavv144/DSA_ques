package pattern;

public class pattern1 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 5;
       // int i = 1;
        int gap = 0;
        int k = 4;
        while (gap <= k) {
            System.out.print("  ");
            k--;
        }
        while (n >= row) {
            int j = 1;
            while (star >= j) {
                System.out.print("*" + " ");
                j++;
            }

            System.out.println();
            row++;
            gap = gap + 2;
            star--;
           // i++;

        }
    }}

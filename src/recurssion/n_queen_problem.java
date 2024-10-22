package recurssion;

import static recurssion.subsequence.c;

public class n_queen_problem {
    public static void main(String[] args) {
        int n=4;
        int tq=4;
        boolean [][] board =new boolean[n][n];
        print_direction(board, 0, n);
    }
    public static void print_direction(boolean[][] board,int r,int tq){
        if(tq==0){
            print_board(board);
            return;
        }
        if(r==board.length){
            return;
        }
        for (int c = 0; c <board.length ; c++) {
            if(is_possible(board,r,c)){
                board[r][c]=true;
                print_direction(board,r+1, tq-1);
                board[r][c]=false;
            }
        }

    }
    public static void print_board(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println(" *********************");
    }
    public static boolean is_possible(boolean[][]board,int row,int coloumn){
        /*this function is used to chk whether is it possible to place the queen at the given place we are placing queen from top
        so we only need to chk 3 directions ass all other are yet to be explored so there will be no queen */

        //for the up direction

        int r=row;
        while (r>=0){
            if(board[r][coloumn]==true){
                    return false;
            }
            r--;
        }
        //for left diagonal

        r = row;
        int c = coloumn;
        while (r>=0&&c>=0){
            if(board[r][c]==true){
                    return false;
            }
            r--;
            c--;
        }
        //for right diagonal
        r = row;
        c = coloumn;
        while (r>=0&&c< board.length){
            if(board[r][c]==true){
                return false;
            }
            c++;
            r--;
        }
        return true;
    }

}

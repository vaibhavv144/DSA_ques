package immersion_DSA;

public class QueenPermutation{
    public static void main(String[] args) {
        boolean[] board= new boolean[4];
        int tq=2;
        Print(board,tq,"",0);

    }
    public static  void Print(boolean [] board,int tq, String ans,int qpsf){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i]==false){
                board[i]=true;
                Print(board,tq,ans+"b"+i+"q"+qpsf,qpsf+i);
            }
        }
    }
}




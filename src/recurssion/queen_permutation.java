package recurssion;
//here in this question we hava 2 queens which are to kept in 4 boxes and we have to find all different permutation for the same
public class queen_permutation {
    public static void main(String[] args) {
        boolean []board=new boolean[4];

        nbr_of_queen(board,2,0,"");
    }

    public static void nbr_of_queen(boolean[]board,int max_queen,int current_queen,String ans) {
        if(current_queen==max_queen){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i]==false){
                board[i]=true;
                nbr_of_queen(board,max_queen,current_queen+1,ans+" "+"b"+i+"q"+current_queen);
                //this step is a part of backtracking here we are undoing the changes caused during recurssion here board[i]
                //becomes true during every recurssion call so we are undoing the same
                board[i]=false;
            }
        }
    }
}

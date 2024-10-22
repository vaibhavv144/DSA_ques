package recurssion;

public class word_search {
    public static void main(String[] args) {
        char[][] maze = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "ABCCED";
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if(maze[i][j]==word.charAt(0)){
                    boolean ans=find_word(maze,i,j,word,0);
                    if(ans==true){
                        System.out.println(ans);
                        return;
                    }
                }
            }

        }
        System.out.println("false");
    }

    private static boolean find_word(char[][] maze,int cc,int cr,String word,int idx) {
        if(word.length()==idx){
            return true;
        }
        if(cc<0||cc>=maze[0].length||cr<0||cr>= maze.length||maze[cr][cc]!=word.charAt(idx)){
            return false;
        }
        int[] r={0,-1,1,0};//aage,upr,neeche,peeche
        int[] c={1,0,0,-1};
        maze[cr][cc]='*';
        for (int i = 0; i < c.length; i++) {
               boolean ans= find_word(maze,cc+c[i],cr+r[i],word,idx+1);
                if(ans==true){
                    return ans;
                }

        }
        maze[cr][cc]=word.charAt(idx);//undo step of backtracking
        return false;
    }
}

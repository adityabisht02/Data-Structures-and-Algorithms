class Solution {
     public boolean isValidSpace(int row, int col, int board[][]) {
        // check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 1 && i != row) {
                return false;
            }
        }
        // check diagonal
        int r = row, c = col;

        while (r >= 0 && c < board[0].length) {
            if (board[r][c] == 1 && r != row) {
                return false;
            }
            r--;
            c++;
        }
        r = row;
        c = col;
        while (r < board.length && c >= 0) {
            if (board[r][c] == 1 && r != row) {
                return false;
            }
            r++;
            c--;
        }

        // check anti diagonal
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 1 && r != row) {
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c = col;
        while (r < board.length && c < board[0].length) {
            if (board[r][c] == 1 && r != row) {
                return false;
            }
            r++;
            c++;
        }
        return true;
    }
    public void addSolution(List<List<String>> ans,int board[][]){
        List<String> temp=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String str="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==1){
                    str=str+"Q";
                }
                else{
                    str=str+".";
                }
            }
            temp.add(str);
        }
        ans.add(temp);
        
    }
    
    public void queens(int n, int board[][], int row,List<List<String>> ans) {
        if (row >= board.length) {
            addSolution(ans,board);
            return ;
        }
        for (int col = 0; col < board[row].length; col++) {
            if (isValidSpace(row, col, board)) {
                board[row][col] = 1;
                //go further
                queens(n, board, row + 1,ans);
                //try for other cases
                board[row][col] = 0;
            }
        }
        
    }
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        int board[][]=new int[n][n];
        queens(n,board,0,ans);
        
        return ans;
    }
}
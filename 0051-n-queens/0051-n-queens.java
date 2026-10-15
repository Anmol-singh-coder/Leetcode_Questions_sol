class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list=new ArrayList<>();
        int[][] board=new int[n][n];
        queens(board,0,list);
        return list;
    }

    void queens(int[][] board, int row, List<List<String>> list){
        if(row==board.length){
            putAnswer(board,list);
            return;
        }
        
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]=1;
                queens(board,row+1,list);
                board[row][j]=0;
            }
            
        }
        return;
    }
    boolean isSafe(int[][] board, int row, int col){
        // Vertically upward
        for(int i=0;i<row;i++){
            if(board[i][col]==1){
                return false;
            }
        }
        // Left side diagonally
        for(int i=1;i<=Math.min(row,col);i++){
            if(board[row-i][col-i]==1){
                return false;
            }
        }
        // Right side diagonally
        for(int i=1;i<=Math.min(row,board.length-1-col);i++){
            if(board[row-i][col+i]==1){
                return false;
            }
        }

        return true;
    }

    void putAnswer(int[][] board, List<List<String>> list){
        List<String> inner=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String el="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]==0){
                    el+=".";
                }else{
                    el+="Q";
                }
            }
            inner.add(el);
        }
        list.add(inner);
    }
}
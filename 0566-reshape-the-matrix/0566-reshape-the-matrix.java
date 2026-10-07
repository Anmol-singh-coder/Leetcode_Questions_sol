class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((r*c)-(mat.length*mat[0].length)!=0){
            return mat;
        }
        int[][] ans=new int[r][c];
        int row=0;
        int col=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                // if(row==r){
                //     row=0;
                // }
                if(col==c){
                    col=0;
                    row++;
                }
                ans[row][col]=mat[i][j];
                col++;
            }
        }
        return ans;
    }
}
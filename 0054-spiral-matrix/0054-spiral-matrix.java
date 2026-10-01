class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        return spiral(matrix,matrix.length-1,matrix[0].length-1,new ArrayList<Integer>());
    }

    List<Integer> spiral(int[][] matrix, int row, int col, List<Integer> list){
        int top=matrix.length-1-row;
        int bottom=row;

        int left=matrix[0].length-1-col;
        int right=col;
        if(top>bottom || left>right){
            return list;
        }
        
        // //upper row
        for(int i=left;i<=right;i++){
            list.add(matrix[top][i]);
        }
        // for(int i=matrix[0].length-1-col;i<=col;i++){
        //     list.add(matrix[matrix.length-1-row][i]);
        // }
        for(int i=top+1;i<=bottom;i++){
            list.add(matrix[i][right]);
        }
        // // right column
        // for(int i=matrix.length-row;i<row;i++){
        //     list.add(matrix[i][col]);
        // }
        // //lower row
        for(int i=right-1;top!=bottom && i>left;i--){
            list.add(matrix[bottom][i]);
        }
        // for(int i=col;i>matrix[0].length-1-col;i--){
        //     list.add(matrix[row][i]);
        // }
        // //left column
        for(int i=bottom;left!=right && i>top;i--){
            list.add(matrix[i][left]);
        }
        // for(int i=row;i>matrix.length-1-row;i--){
        //     list.add(matrix[i][matrix[0].length-1-col]);
        // }
        return spiral(matrix,row-1,col-1,list);
    }
}
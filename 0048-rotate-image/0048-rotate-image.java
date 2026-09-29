class Solution {
    public void rotate(int[][] matrix) {
        //for transpose
        for(int row=0;row<matrix.length;row++){
            for(int col=row+1;col<matrix[0].length;col++){
                int temp=matrix[col][row];
                matrix[col][row]=matrix[row][col];
                matrix[row][col]=temp;
            }
        }
        

        // Now Reversing the rows
        int low=0;
        int high=matrix[0].length-1;
        while(low<high){
            for(int row=0;row<matrix.length;row++){
                int temp=matrix[row][low];
                matrix[row][low]=matrix[row][high];
                matrix[row][high]=temp;             
            }
            low++;
            high--;
        }
        return;
    }
} 
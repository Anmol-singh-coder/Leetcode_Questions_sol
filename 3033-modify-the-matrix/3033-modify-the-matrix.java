class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[] arr=new int[matrix[0].length];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        for(int row=0;row<matrix[0].length;row++){
            int max=-1;
            for(int col=0;col<matrix.length;col++){
                if(matrix[col][row]>max){
                    max=matrix[col][row];
                }
            }
            arr[row]=max;
        }
        
        for(int row=0;row<matrix[0].length;row++){
            
            for(int col=0;col<matrix.length;col++){
                if(matrix[col][row]==-1){
                    matrix[col][row]=arr[row];
                }
            }
            
        }
        return matrix;
        
    }
}
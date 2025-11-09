class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        outerLoop:
        for(int i=0;i<matrix.length;i++){
            int min=0;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<matrix[i][min]){
                    min=j;
                }
            }
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][min]<matrix[j][min]) continue outerLoop;
            }
            list.add(matrix[i][min]);
        }
        return list;
    }
}
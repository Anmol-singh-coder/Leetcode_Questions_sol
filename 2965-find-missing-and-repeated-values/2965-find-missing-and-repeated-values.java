class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        boolean[] arr=new boolean[grid.length*grid.length];
        int repeated=0;
        boolean found=false;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int ind=grid[i][j]-1;
                if(arr[ind] && !found){
                    repeated=grid[i][j];
                    found=true;
                }
                arr[ind]=true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(!arr[i]){
                return new int[]{repeated,i+1};
            }
        }
        return new int[]{-1,-1};        
    }
}
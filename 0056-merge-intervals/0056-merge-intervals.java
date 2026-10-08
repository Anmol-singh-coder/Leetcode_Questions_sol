class Solution {
    public int[][] merge(int[][] intervals) {
        sortMatrix(intervals);
        
        ArrayList<int[]> list=new ArrayList<>();
        list.add(intervals[0]);
        
        for(int i=1;i<intervals.length;i++){
            int[] current=intervals[i];
            merge(list, current);
        }

        return answer(list);
    }

    public void merge(ArrayList<int[]> list, int[] current){
        int[] last=list.get(list.size()-1);
        if(last[1]<current[0]){
            list.add(current);
            return;
        }
        last[1]=Math.max(current[1],last[1]);
        
    }

    public int[][] answer(ArrayList<int[]> list){
        int[][] matrix=new int[list.size()][2];
        int i=0;
        for(int[] arr:list){
            matrix[i]=arr;
            i++;
        }
        return matrix;
    }

    public void sortMatrix(int[][] matrix){
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix.length-i-1;j++){
                if(matrix[j][0]>matrix[j+1][0]){
                    int[] temp=matrix[j];
                    matrix[j]=matrix[j+1];
                    matrix[j+1]=temp;
                }
            }
        }
    }
}
class Solution {
    public int minimumSum(int[] arr) {       
        int ansSum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-2;i++){
            int j=i+1;
            while(j<arr.length-1){
                if(arr[j]>arr[i]){
                    int k=j+1;
                    while(k!=arr.length){
                        if(arr[k]<arr[j]){
                            int sum=arr[i]+arr[j]+arr[k];
                            if(sum<ansSum){
                                ansSum=sum;
                            }
                        }
                        k++;
                    }
                }
                j++;
            }
            
        }
        if(ansSum==Integer.MAX_VALUE){
            return -1;
        }
        return ansSum;









        // int j=i+1;
        // while(j!=arr.length-2 && arr[j]==arr[j-1]){
        //     j++;
        // }
        // if(j>arr.length-2){
        //     return -1;
        // }
        // int k=j+1;
        // while(k!=arr.length && arr[k]==arr[k-1]){
        //     k++;
        // }
        // if(k==arr.length){
        //     return -1;
        // }
        // return arr[i]+arr[j]+arr[k];
    }
}
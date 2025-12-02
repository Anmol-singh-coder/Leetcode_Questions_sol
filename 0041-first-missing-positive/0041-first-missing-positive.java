class Solution {
    public int firstMissingPositive(int[] arr) {
        if(arr.length==1){
            if(arr[0]!=1){
                return 1;
            }else{
                return 2;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1 && arr[i]<arr.length && arr[i]>0){
                
                int correct=arr[i]-1;
                if(arr[correct]!=arr[i]){
                    swap(arr,correct,i);
                    i--;
                }else{
                    continue;
                }
            }
            
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }
    void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
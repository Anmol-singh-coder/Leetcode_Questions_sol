class Solution {
    public int[] rearrangeArray(int[] arr) {
        int pPost=0;
        int pNeg=1;
        // while(pPost<arr.length-1 && pNeg<arr.length){
        //     while(pPost<arr.length-1 && arr[pPost]>0){
        //         pPost+=2;
        //     }
        //     while(pNeg<arr.length && arr[pNeg]<0){
        //         pNeg+=2;
        //     }
        //     if(pPost>arr.length-2 || pNeg>arr.length-1){
        //         break;
        //     }
        //     int temp=arr[pPost];
        //     arr[pPost]=arr[pNeg];
        //     arr[pNeg]=temp;
        // }
        // return arr;

        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans[pPost]=arr[i];  
                pPost+=2;              
            }else{
                ans[pNeg]=arr[i];
                pNeg+=2;
            }
        }
        return ans;
    }
}
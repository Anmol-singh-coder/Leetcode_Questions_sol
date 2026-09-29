class Solution {
    public void rotate(int[] arr, int k) {
        if(arr.length==1){
            return;
        }
        k=k%arr.length;

        //Main thing
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        
        return;
    
    }

    void reverse(int[] arr, int s, int e){
        int low=s;
        int high=e;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}
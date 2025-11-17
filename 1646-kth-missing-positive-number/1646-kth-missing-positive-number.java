class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(arr.length==1){
            if(k<arr[0]){
                return k;
            }else{
                return k+1;
            }
        }
        int st=0;
        int check=0;
        int end=arr.length-1;
        while(st<end){
            int mid=st+(end-st)/2;
            check=mid+k;
            if(check>=arr[mid]){
                st=mid+1;
            }else{
                end=mid;
            }
        }
        if(arr[end]>end+k){
            return end+k;
        }
        return end+k+1;
         
    }
}
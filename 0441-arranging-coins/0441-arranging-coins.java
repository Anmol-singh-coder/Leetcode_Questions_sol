class Solution {
    public int arrangeCoins(int n) {
        int st=1;
        int end=n;
        while(st<=end){
            int mid=st+(end-st)/2;
            long sum=(long)(mid)*(mid+1)/2;
            if(sum==n){
                return mid;
            }else if(sum<n){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return end; 
    }
}
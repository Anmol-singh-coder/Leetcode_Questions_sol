class Solution {
    public int pivotInteger(int n) {
        int st=1;
        int end=n;
        while(st<=end){
            int mid=st+(end-st)/2;
            if((mid*(mid+1))/2==((n-mid+1)*(mid+n))/2){
                return mid;
            }else if((mid*(mid+1))/2>((n-mid+1)*(mid+n))/2){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return -1;
    }
}
class Solution {
    public int arithmeticTriplets(int[] arr, int diff) {
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            int j=i+1;
            int k=arr.length-1;
            while(j!=k && arr[j]-arr[i]<diff){
                j++;
            }
            if(j==k || arr[j]-arr[i]>diff){
                continue;                
            }
            while(k!=j && arr[k]-arr[j]>diff){
                k--;
            }
            if(j==k || arr[k]-arr[j]<diff){
                continue;
            }
            count++;
        }
        return count;
    }
}
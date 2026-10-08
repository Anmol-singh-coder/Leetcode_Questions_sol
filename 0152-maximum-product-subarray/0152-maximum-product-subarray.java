class Solution {
    public int maxProduct(int[] arr) {
        int result=arr[0];
        int minBest=arr[0];
        int maxBest=arr[0];
        for(int i=1;i<arr.length;i++){
            int v1=arr[i];
            int v2=minBest*arr[i];
            int v3=maxBest*arr[i];
            minBest=Math.min(v1,Math.min(v2,v3));
            maxBest=Math.max(v1,Math.max(v2,v3));
            result=Math.max(result,maxBest);
        }
        return result;
    }
}
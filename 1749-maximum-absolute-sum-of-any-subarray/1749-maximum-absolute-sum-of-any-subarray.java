class Solution {
    public int maxAbsoluteSum(int[] arr) {
        int bestMin=arr[0];
        int bestMax=arr[0];
        int result=Math.abs(arr[0]);
        for(int i=1;i<arr.length;i++){
            int v1=arr[i];
            int v2=bestMin+arr[i];
            int v3=bestMax+arr[i];
            bestMin=Math.min(v1,Math.min(v2,v3));
            bestMax=Math.max(v1,Math.max(v3,v2));
            result=Math.max(result,Math.max(Math.abs(bestMin),Math.abs(bestMax)));
        }
        return result;
    }
}
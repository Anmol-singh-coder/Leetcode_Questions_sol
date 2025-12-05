class Solution {
    public int countPartitions(int[] arr) {
        int len=arr.length;
        for(int i=1;i<len;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        int count=0;
        for(int i=0;i<len-1;i++){
            int total=arr[len-1]-2*arr[i];
            if((total)%2==0){
                count++;
            }
        }
        return count;
    }
}
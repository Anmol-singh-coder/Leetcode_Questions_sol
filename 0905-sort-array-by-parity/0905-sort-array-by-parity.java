class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int st=0;
        int end=arr.length-1;
        while(st<end){
            while(st<arr.length && arr[st]%2==0){
                st++;
            }
            
            while(end>-1 && arr[end]%2!=0){
                end--;
            }
            if(st>=end || st==arr.length){
                break;
            }
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
        }
        return arr;
    }
}
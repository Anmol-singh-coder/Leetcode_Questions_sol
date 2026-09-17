class Solution {
    public int[] sortArrayByParityII(int[] arr) {
        int pEven=0;
        int pOdd=1;
        while(pEven < arr.length && pOdd < arr.length) {
            while(pEven<arr.length && arr[pEven]%2==0){
                pEven+=2;
            }
            while(pOdd<arr.length && arr[pOdd]%2!=0){
                pOdd+=2;
            }
            if(pEven>=arr.length || pOdd>=arr.length){
                break;
            }
            int temp=arr[pEven];
            arr[pEven]=arr[pOdd];
            arr[pOdd]=temp;            
        }
        return arr;
    }
}
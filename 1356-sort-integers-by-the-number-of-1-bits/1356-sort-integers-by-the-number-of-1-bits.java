class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            boolean swap=false;
            for(int j=0;j<arr.length-1-i;j++){
                if((countSetBits(arr[j])>countSetBits(arr[j+1])) || ((countSetBits(arr[j])==countSetBits(arr[j+1])) && (arr[j]>arr[j+1]))){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap=true;    
                }
            }
            if(!swap){
                break;
            }
        }
        return arr;
    }
    int countSetBits(int n){
        int count=0;
        while(n>0){
            n=n-(n&(-n));
            count++;
        }
        return count;
    }
}
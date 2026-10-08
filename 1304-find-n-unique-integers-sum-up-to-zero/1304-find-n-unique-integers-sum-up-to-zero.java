class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int el=1;
        if((n&1)!=0){
            arr[0]=0;
            n--;
            for(int i=1;i<n;i++){
                arr[i++]=el;
                arr[i]=0-el;
                el++;
            }
        }else{
            for(int i=0;i<n;i++){
                arr[i++]=el;
                arr[i]=0-el;
                el++;
            }
        }
        return arr;
    }
}
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for(int i=left;i<=right;i++){
            if(isNumberSetPrime(i)){
                ans++;
            }
        }
        return ans;
    }
    boolean isNumberSetPrime(int n){
        int count=0;
        while(n>0){
            n=n-(n&(-n));
            count++;
        }
        if(count<2){
            return false;
        }
        for(int i=2;i*i<=count;i++){
            if(count%i==0){
                return false;
            }
        }
        return true;
    }
}
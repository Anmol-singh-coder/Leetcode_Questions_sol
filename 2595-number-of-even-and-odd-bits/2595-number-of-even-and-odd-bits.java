class Solution {
    public int[] evenOddBit(int n) {
        int evenPlace=0;
        int oddPlace=0;
        int i=0;
        while(n>0){
            if((n&1)>0){
                if(i%2==0) evenPlace++;
                else oddPlace++;
            }
            n=n>>1;
            i++;
        }
        return new int[]{evenPlace,oddPlace};
    }
}
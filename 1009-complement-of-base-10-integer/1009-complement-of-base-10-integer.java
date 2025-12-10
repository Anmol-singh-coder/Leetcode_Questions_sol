class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int all1Bits=(1<<(int)(Math.log(n)/Math.log(2)+1))-1;
        return all1Bits^n; 
    }
}
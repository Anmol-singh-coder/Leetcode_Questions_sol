class Solution {
    public int findComplement(int num) {
        int all1Bits=(1<<(int)((Math.log(num))/Math.log(2)+1))-1;
        return all1Bits^num;
    }
}
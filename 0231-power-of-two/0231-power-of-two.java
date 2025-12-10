class Solution {
    public boolean isPowerOfTwo(int n) {
        return (1<<((int)((Math.log(n)/Math.log(2))))==n);
    }
}
class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        while(fast != 1 && sqOnce(fast)!=1){
            slow=sqOnce(slow);
            fast=sqTwice(fast);
            if(fast==slow){
                return false;
            }
        }
        return true;
    }
    public int sqOnce(int n){
        return sq(n);
    }
    public int sqTwice(int n){

        n=sqOnce(n);
        return sqOnce(n);
    }
    public int sq(int n){
        int ans=0;
        while(n>0){
            ans+=Math.pow(n%10,2);
            n/=10;
        }
        return ans;
    }
}
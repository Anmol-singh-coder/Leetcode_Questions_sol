class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans=0;
        for(int i:nums){
            if((i&1)==0){
                ans|=i;
            }
        }
        return ans;
    }
}
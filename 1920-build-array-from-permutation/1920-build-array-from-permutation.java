class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        int ind=0;
        for(int i:nums){
            ans[ind]=nums[i];
            ind++;
        }
        return ans;
    }
}
class Solution {
    public int minimumOperations(int[] nums) {
        int operation=0;
        for(int element=0;element<nums.length;element++){
            if(nums[element]%3==0){
                continue;
            }
            operation++;
        }
        return operation;
    }
}
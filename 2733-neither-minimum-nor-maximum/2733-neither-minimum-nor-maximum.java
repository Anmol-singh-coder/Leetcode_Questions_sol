class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length==2 || nums.length==1){
            return -1;
        }
        int min_value=Integer.MAX_VALUE;
        int max_value=Integer.MIN_VALUE;
        for(int i:nums){
            if(i<min_value){
                min_value=i;
            }
            if(i>max_value){
                max_value=i;
            }
        }
        for(int i:nums){
            if(i!=min_value && i!=max_value){
                return i;
            }
        }
        return -1;
    }
}
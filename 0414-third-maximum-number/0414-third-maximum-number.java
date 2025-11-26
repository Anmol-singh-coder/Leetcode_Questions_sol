class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        
        int count_distinct=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=nums[i+1]){
                count_distinct++;
            }
            if(count_distinct==2){
                return nums[i];
            }
        }
        
        return nums[nums.length-1];
    }
}
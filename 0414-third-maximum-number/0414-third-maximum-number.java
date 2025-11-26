class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
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
        if(nums.length==3){
            if(nums[1]!=nums[2] && nums[0]!=nums[1]){
                return nums[0];
            }else{
                return nums[2];
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
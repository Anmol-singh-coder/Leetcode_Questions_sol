class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums[nums.length-1]>nums[0]){
            return nums[0];
        }
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]>=nums[0] && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(nums[mid]<nums[0] && nums[mid]<nums[mid-1]){
                return nums[mid];
            
            }else if(nums[mid]>=nums[0]){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
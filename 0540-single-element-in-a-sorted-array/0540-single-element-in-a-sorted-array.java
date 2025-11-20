class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        int st=2;
        int end=nums.length-3;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }else if(nums[mid]==nums[mid-1]){
                if(((mid-1)-st)%2==0){
                    st=mid+1;
                }else{
                    end=mid-2;
                }
                
            }else{
                if((end-mid+1)%2==0){
                    end=mid-1;
                }else{
                    st=mid+2;
                }
            }
        }
        return -1;
    }
}
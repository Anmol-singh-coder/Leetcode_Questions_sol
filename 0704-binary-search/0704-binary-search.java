class Solution {
    public int search(int[] nums, int target) {
        int l=nums.length-1;
        int s=0;
        int mid=0;
        while(l>=s){
            mid=(l+s)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                l=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}
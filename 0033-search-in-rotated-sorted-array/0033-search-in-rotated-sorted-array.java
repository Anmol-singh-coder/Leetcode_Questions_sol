class Solution {
    public int search(int[] nums, int target) {
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]<nums[0]){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        int pivot=end;
        int ans=binarysearch(nums,target,0,pivot);
        if(ans==-1){
            ans=binarysearch(nums,target,pivot+1,nums.length-1);
        }
        return ans;
    }
    
    int binarysearch(int[] nums,int target,int st,int end){
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return -1;
    }
}
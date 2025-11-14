class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        arr[0]=occurence(nums,target,true);
        if(arr[0]==-1){
            return arr;
        }
        arr[1]=occurence(nums,target,false);
        return arr;
    }

    int occurence(int[] nums,int target,boolean firstOcc){
        int ans=-1;
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                ans=mid;
                if(firstOcc){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;
    }
}
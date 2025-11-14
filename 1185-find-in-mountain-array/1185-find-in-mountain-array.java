/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        return peakElement(mountainArr,target);
    }
    int peakElement(MountainArray nums,int target){
        int st=0;
        int end=nums.length()-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(nums.get(mid)>nums.get(mid+1)){
                end=mid;
            }else{
                st=mid+1;
            }
        }
        return increPart(nums, st, target);
    }

    int increPart(MountainArray nums,int peak,int target){
        int st=0;
        int end=peak;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums.get(mid)<target){
                st=mid+1;
            }else if(nums.get(mid)>target){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return decrePart(nums,peak,target);
    }

    int decrePart(MountainArray nums,int peak,int target){
        int st=peak+1;
        int end=nums.length()-1;
        while (st<=end) {
            int mid=st+(end-st)/2;
            if(nums.get(mid)==target){
                return mid;
            }else if(nums.get(mid)<target){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return -1;
    }

}
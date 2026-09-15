class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans1=0,ans2=0;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return new int[]{returnNumber(nums1,nums2),returnNumber(nums2,nums1)};
    }

    int returnNumber(int[] arr, int[] search){
        int ans=0;
        boolean[] boolArr=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i!=0 && arr[i] == arr[i-1] && boolArr[i-1]){
                ans++;
                continue;
            }
            if(isPresent(arr[i],search)){
                ans++;
                boolArr[i]=true;
            }
            

        }
        return ans;
    }
    boolean isPresent(int target, int[] search){
        int st=0;
        int end=search.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(search[mid]==target){
                return true;
            }else if(search[mid]>target){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return false;
    }
    
}
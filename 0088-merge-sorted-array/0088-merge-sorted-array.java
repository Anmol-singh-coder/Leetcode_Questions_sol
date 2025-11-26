class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<m+n;i++){            
            nums1[i]=nums2[i-m];            
        }
        for(int i=0;i<nums1.length-1;i++){
            boolean swapped=false;
            for(int j=1;j<nums1.length-i;j++){
                if(nums1[j]<nums1[j-1]){
                    int temp=nums1[j];
                    nums1[j]=nums1[j-1];
                    nums1[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        
    }
}
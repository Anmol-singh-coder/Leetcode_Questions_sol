class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        if(nums1.length<=nums2.length){
            for(int i=0;i<nums2.length;i++){
                if(nums1[0]==nums2[i]){
                    list.add(nums1[0]);
                    break;
                }
            }
            for(int i=1;i<nums1.length;i++){
                if(nums1[i]!=nums1[i-1]){
                    int st=0;
                    int end=nums2.length-1;
                    while(st<=end){
                        int mid=st+(end-st)/2;
                        if(nums1[i]==nums2[mid]){
                            list.add(nums2[mid]);
                            break;
                        }else if(nums1[i]>nums2[mid]){
                            st=mid+1;
                        }else{
                            end=mid-1;
                        }
                    }
                }
            }

        }else{
            for(int i=0;i<nums1.length;i++){
                if(nums1[i]==nums2[0]){
                    list.add(nums2[0]);
                    break;
                }
            }
            for(int i=1;i<nums2.length;i++){
                if(nums2[i]!=nums2[i-1]){
                    int st=0;
                    int end=nums1.length-1;
                    while(st<=end){
                        int mid=st+(end-st)/2;
                        if(nums2[i]==nums1[mid]){
                            list.add(nums1[mid]);
                            break;
                        }else if(nums2[i]>nums1[mid]){
                            st=mid+1;
                        }else{
                            end=mid-1;
                        }
                    }
                }
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}
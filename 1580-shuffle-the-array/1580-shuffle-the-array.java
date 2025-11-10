class Solution {
    public int[] shuffle(int[] nums, int n) {
        int p=0;
        for(int i=n;i<nums.length-1 ;i++){
            int current=nums[i];
            int j=i-1;  
            while(j!=i-n+p){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=current;
            p++;
        }
        return nums;
    }
}
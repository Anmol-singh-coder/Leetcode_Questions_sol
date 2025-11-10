// That’s a clever way to repurpose insertion logic — you’re literally “inserting” the second half elements into their shuffled spots.o(n2)
class Solution {
    public int removeDuplicates(int[] nums) {
        int ind=1;
        if(nums.length==1){
            return 1;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }else{
                nums[ind]=nums[i];
                ind++;
            }
        }
        return ind;
    }
}

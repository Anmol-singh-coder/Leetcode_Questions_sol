class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            if(countAndCompare(i,k)){
                ans+=nums.get(i);
            }
        }
        return ans;
    }
    
    boolean countAndCompare(int i,int totalShould){
        int count=0;
        while(i>0){
            if((i&1)>0){
                count++;
            }
            i>>=1;
        }
        return count==totalShould;
    }
}
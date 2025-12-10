class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=countSetBits(i);
        }
        return ans;
    }

    int countSetBits(int i){
        int count=0;
        while(i>0){
            if((1&i)>0){
                count++;
            }
            i=i>>1;
        }
        return count;
    }
}
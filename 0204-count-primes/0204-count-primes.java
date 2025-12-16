class Solution {
    public int countPrimes(int n) {
        boolean[] ans=new boolean[n];
        for(int i=2;i*i<n;i++){
            if(!ans[i]){
                for(int j=i*i;j<ans.length;j+=i){
                    ans[j]=true;
                }
            }
        }
        int count=0;
        for(int i=2;i<ans.length;i++){
            if(!ans[i]){
                count++;
            }
        }
        return count;
    }
}
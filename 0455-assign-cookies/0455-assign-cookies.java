class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans=0,j=0;
        for(int i=0;i<g.length;i++){
            for(int k=j;k<s.length;k++){
                if(g[i]<=s[k]){
                    ans++;
                    j=k+1;
                    
                    break;
                }
            }
        }
        return ans;
    }
}
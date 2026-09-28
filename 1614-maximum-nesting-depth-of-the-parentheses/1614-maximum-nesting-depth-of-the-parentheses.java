class Solution {
    public int maxDepth(String s) {
        if(s.length()==1){
            return 0;
        }

        int ans=0;
        int curr=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                curr++;
            }else if(s.charAt(i)==')'){
                curr--;
            }else{
                continue;
            }
            ans=(curr>ans)?curr:ans;
        }
        return ans;
    }
}
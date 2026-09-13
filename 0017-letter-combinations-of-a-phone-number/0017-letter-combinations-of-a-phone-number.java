class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list=new ArrayList<String>();
        ans(digits,"",list);
        return list;
    }

    void ans(String up, String p,ArrayList<String> list){
        
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        int n=up.charAt(0)-'0';
        int st=(n-2)*3;
        int end=(n-1)*3;
        if(n==9 || n==7){
            end++;
        }
        if(n>7){
            st++;
            end++;
        }
        for(int i=st;i<end;i++){
            ans(up.substring(1),p+(char)('a'+i),list);
        }

    }

    
}
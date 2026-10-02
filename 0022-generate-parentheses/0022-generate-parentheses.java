class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        generate(n, n, "", list);
        return list;
    }
    void generate(int countOpen, int countClose, String p, List<String> list){
        if(countOpen==0 && countClose==0){
            list.add(p);
            return;
        }
        if(countOpen==countClose){
            generate(countOpen-1,countClose,p+"(",list);
        }else{
            if(countOpen!=0){
                generate(countOpen-1,countClose,p+"(",list);                
            }
            generate(countOpen,countClose-1,p+")",list);
            
        }
    }
}
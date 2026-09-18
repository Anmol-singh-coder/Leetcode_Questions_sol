class Solution {
    public List<String> letterCasePermutation(String s) {
        ArrayList<String> list=new ArrayList<>();
        getPer(s, "", list);
        return list;
    }
    void getPer(String up, String p, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        if(up.charAt(0)>='a' && up.charAt(0)<='z'){
            getPer(up.substring(1),p+up.substring(0,1).toUpperCase(),list);
            getPer(up.substring(1),p+up.charAt(0),list);
        }else if(up.charAt(0)>='A' && up.charAt(0)<='Z'){
            getPer(up.substring(1),p+up.substring(0,1).toLowerCase(),list); 
            getPer(up.substring(1),p+up.charAt(0),list);           
        }else{
            getPer(up.substring(1),p+up.charAt(0),list);

        }
        
    }
}
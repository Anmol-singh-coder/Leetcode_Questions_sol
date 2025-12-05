class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length()>typed.length()){
            return false;
        }
        if(typed.charAt(0)!=name.charAt(0)){
            return false;
        }
        int j=0;
        for(int i=0;i<typed.length();i++){
            
            if(j<name.length() && typed.charAt(i)==name.charAt(j)){
                j++;
                
            }else{
                if(typed.charAt(i)==typed.charAt(i-1)){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return j==name.length();
    }
}
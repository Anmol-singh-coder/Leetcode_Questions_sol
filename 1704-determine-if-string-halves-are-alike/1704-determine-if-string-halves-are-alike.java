class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int first=0;
        int second=0;
        int len=s.length()/2;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                first++;
            }
        }
        for(int i=len;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                second++;
            }
        }
        if(first==second){
            return true;
        }
        return false;
    }
}
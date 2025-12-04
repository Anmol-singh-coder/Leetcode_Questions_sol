class Solution {
    public String freqAlphabets(String s) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i<s.length()-2 && s.charAt(i+2)=='#'){
                String part=s.substring(i,i+2);
                int value=Integer.parseInt(part);
                char ans=(char)(96+value);
                builder.append(ans);
                i+=2;
            }else{
                
                builder.append((char)(96+(int)(s.charAt(i)-'0')));
            }
        }
        return builder.toString();
    }
}
class Solution {
    public char kthCharacter(int k) {
        StringBuilder builder=new StringBuilder();
        builder.append("a");
        return giveChar(builder,k);
    }
    char giveChar(StringBuilder builder, int k){
        if(builder.length()>=k){
            return builder.charAt(k-1);
        }
        int len=builder.length();
        for(int i=0;i<len;i++){
            builder.append((char)(builder.charAt(i)+1));
        }
        return giveChar(builder,k);
        
    }
}
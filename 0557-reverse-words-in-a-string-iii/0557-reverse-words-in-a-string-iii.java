class Solution {
    public String reverseWords(String s) {
        StringBuilder builder =new StringBuilder();
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            builder.append(swap(arr[i]));
            if(i<arr.length-1){
                builder.append(" ");
            }
        
        }
        return builder.toString();



    }
    String swap(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
        
        
    }
}
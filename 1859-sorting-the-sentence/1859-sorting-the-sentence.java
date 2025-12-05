class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if((int)(arr[i].charAt(arr[i].length()-1)-'0')!=i+1){
                int correct=(int)(arr[i].charAt(arr[i].length()-1)-'0')-1;
                String temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
                i--;
            }
        }
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i].substring(0,arr[i].length()-1));
            if(i<arr.length-1){
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
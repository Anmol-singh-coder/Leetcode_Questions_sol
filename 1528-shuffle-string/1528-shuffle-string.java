class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder builder=new StringBuilder(s);
        for(int i=0;i<indices.length;i++){
            if(indices[i]!=i){
                swap(indices,builder,indices[i],i);
                i--;
            }else{
                continue;
            }
        }
        return builder.toString();
    }
    void swap(int[] indices,StringBuilder builder,int first,int second){
        int temp=indices[first];
        char temps=builder.charAt(first);
        indices[first]=indices[second];
        builder.setCharAt(first,builder.charAt(second));
        indices[second]=temp;
        builder.setCharAt(second,temps);

    }
}
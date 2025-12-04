class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder1=new StringBuilder();
        StringBuilder builder2=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            builder1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            builder2.append(word2[i]);
        }
        if(builder1.compareTo(builder2)==0){
            return true;
        }
        return false;

    }
}
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int completeCounter=0;
        for(int i=0;i<bits.length-1;i++){
            if(bits[i]==0 && completeCounter==0){
                continue;
            }
            if(completeCounter==0 && bits[i]==1){
                completeCounter=1;
                continue;
            }
            if(completeCounter==1){
                completeCounter=0;
            }
        }
        if(completeCounter==1){
            return false;
        }
        return true;
             
        
    }
}
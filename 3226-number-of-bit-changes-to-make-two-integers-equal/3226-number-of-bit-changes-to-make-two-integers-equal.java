class Solution {
    public int minChanges(int n, int k) {
        int count=0;
        int num=n>>(int)((Math.log(k)/Math.log(2))+1);
        while(k>0){
            if(((k&1)!=0) && ((n&1)==0)){
                return -1;
            }
            if(((n&1)>0) && ((k&1)==0)){
                count++;
            }
            k>>=1;
            n>>=1;
        }
        
        while(num>0){
            if((num&1)!=0){
                count++;                
            }
            num>>=1;
        }
        return count;
    }
}
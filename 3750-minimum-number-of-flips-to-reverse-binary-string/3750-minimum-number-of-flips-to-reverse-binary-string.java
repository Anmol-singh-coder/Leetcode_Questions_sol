class Solution {
    public int minimumFlips(int n) {
        int count=0;
        int i=0;
        int len=(int)(Math.log(n)/Math.log(2))+1;
        while(i<=(len/2)-1){
            if(((n&(1<<i))>0) && ((n&(1<<(len-i-1)))==0)){
                count++;
            }
            if(((n&(1<<i))==0) && ((n&(1<<(len-i-1)))>0)){
                count++;
            }
            i++;
        }
        return count*2;
    }
}
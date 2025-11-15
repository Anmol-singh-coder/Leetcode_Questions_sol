class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        int st=1;
        int end=num/2;
        while(st<=end){
            int mid=st+(end-st)/2;
            long sq=(long)mid*mid;
            if(sq==num){
                return true;
            }else if(sq<num){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        if((long)end*end==num){
            return true;
        }
        return false;
    }
}
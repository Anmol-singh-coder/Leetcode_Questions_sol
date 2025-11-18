class Solution {
    public boolean isPalindrome(int x) {
        int a=10;
        int rem=0;
        int num=x;
        if(x<0 || (x%a==0 && x!=0)){
            return false;
        }
        else{
            while(num!=0){
                rem=rem*10+num%10;
                num=num/10;
            }
        }
        if(rem!=x){
            return false;
        }
        return true;
            
        

    }
}
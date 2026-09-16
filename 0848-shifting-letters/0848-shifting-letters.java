class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long sum=0;
        for(int i:shifts){
            sum+=i;
        }
        char[] arr=s.toCharArray();
        //s=((char)('a'+(s.charAt(0)+(sum%26)-'a')%26)+s.substring(1));
        arr[0]=(char)('a'+(s.charAt(0)+(sum%26)-'a')%26);        
        for(int i=1;i<shifts.length;i++){
            sum-=shifts[i-1];
            // String first=s.substring(0,i);            
            // String second=s.substring(i+1,s.length());
            // s=first+(char)('a'+(s.charAt(i)+(sum%26)-'a')%26)+second;
            arr[i]=(char)('a'+(s.charAt(i)+(sum%26)-'a')%26);
        }
        return new String(arr);
    }
}
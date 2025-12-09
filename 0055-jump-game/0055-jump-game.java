class Solution {
    static boolean canJump(int[] arr) {
        if(arr.length==1){
            return true;
        }
        int position=0;
        int i=0;
        while(i<arr.length-1){
            if(arr[i]>position){
                position=arr[i];
            }
            if(position==0 && i<arr.length){
                return false;
            }
            if(arr.length-1-i<=position){
                return true;
            }
            i++;
            position--;
        }
        return true;
    }
}
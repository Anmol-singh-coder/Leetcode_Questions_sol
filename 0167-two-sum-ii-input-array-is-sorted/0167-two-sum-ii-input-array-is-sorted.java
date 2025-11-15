class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int num=0;num<numbers.length;num++){
            int st=0;
            int end=numbers.length-1;
            while(st<=end){
                int mid=st+(end-st)/2;
                if(numbers[num]+numbers[mid]==target && mid!=num){
                    return new int[]{num+1,mid+1};
                }else if(numbers[num]+numbers[mid]>target){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
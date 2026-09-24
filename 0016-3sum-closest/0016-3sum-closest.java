class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int i=0;
        int ansSum=arr[0]+arr[1]+arr[2];
        
        while(i<arr.length-2){
            int low=i+1;
            int high=arr.length-1;
            while(low!=high){
                int sum=arr[i]+arr[low]+arr[high];
                if(sum==target){
                    return sum;
                }else{
                    if(Math.abs(target-sum)<Math.abs(target-ansSum)){
                        ansSum=sum;
                    }
                }
                if(sum<target){
                    low++;
                }else{
                    high--;
                }
            }
            i++;
        }
        return ansSum;

        
              


    }
}
class Solution {
    public int missingNumber(int[] arr) {
        // int sumNum=0,sumOriginal=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     sumNum+=nums[i];
        //     sumOriginal+=i;
        // }
        // if(sumNum==sumOriginal){
        //     return 0;
        // }
        // return sumOriginal-sumNum;


        //By CyclicSort

        for(int i=0;i<arr.length;i++){
            if(arr[i]==i || arr[i]==arr.length){
                continue;
            }else{
                int temp=arr[i];
                arr[i]=arr[temp];
                arr[temp]=temp;
                i--;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }
}
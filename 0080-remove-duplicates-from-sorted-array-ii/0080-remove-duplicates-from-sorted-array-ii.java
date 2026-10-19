class Solution {
    public int removeDuplicates(int[] arr) {
        int k=0,num=100000,count=0,position=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=num){
                arr[position++]=arr[i];
                num=arr[i];
                count=1;

            }else{
                if(count==2){
                    continue;
                }else{
                    arr[position++]=num;
                    count++;
                }
            }
            k++;
        }
        return k;
    }
}
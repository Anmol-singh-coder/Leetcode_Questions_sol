class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            int st=0;
            int end=arr.length-1;
            while(st<=end){
                int mid=st+(end-st)/2;
                if(arr[i]*2==arr[mid] && i!=mid){
                    return true;
                }else if(arr[i]*2<arr[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }
        }
        return false;
    }
}
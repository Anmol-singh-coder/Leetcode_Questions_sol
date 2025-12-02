class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                int correct=arr[i]-1;
                if(arr[correct]!=arr[i]){
                    swap(arr,correct,i);
                    i--;
                }
                else{
                    continue;
                }
            }

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                list.add(arr[i]);
            }
        }
        return list;
    }
    void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
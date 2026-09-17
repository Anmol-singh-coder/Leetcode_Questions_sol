class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        per(nums, new ArrayList<>(), 0, list);
        
        
        return list;
        // return list.subList(0,list.size());
    }

    public void per(int[] arr,ArrayList<Integer> current, int ind, List<List<Integer>> list){
        if(ind==arr.length){
            list.add(current);
            return;
        }
        for(int i=0;i<=current.size();i++){
            ArrayList<Integer> first=new ArrayList<>(current.subList(0,i));
            ArrayList<Integer> second=new ArrayList<>(current.subList(i,current.size()));
            ArrayList<Integer> inner=new ArrayList<>();
            inner.addAll(first);
            inner.add(arr[ind]);
            inner.addAll(second);
            per(arr, inner, ind+1, list);
        }
    }
}
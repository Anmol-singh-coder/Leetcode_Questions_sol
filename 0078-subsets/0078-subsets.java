class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int el:nums){
            int len=outer.size();
            for(int i=0;i<len;i++){
                ArrayList<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(el);
                outer.add(inner);
            }
        }
        return outer;
    }
}
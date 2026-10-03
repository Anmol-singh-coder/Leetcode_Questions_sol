class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        combination(candidates,target,0,new ArrayList<>(),list);
        return list;
    }

    void combination(int[] candidates, int target, int ind, List<Integer> currList, List<List<Integer>> list){
        if(target==0){
            list.add(new ArrayList<>(currList));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            // List<Integer> inner=new ArrayList<>(currList.get(i))
            currList.add(candidates[i]);
            combination(candidates,target-candidates[i],i,currList,list);
            currList.remove(currList.size()-1);
        }
    }
}
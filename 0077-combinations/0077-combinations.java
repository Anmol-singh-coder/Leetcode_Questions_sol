class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        combination(1, n,0,new ArrayList<>(), list, k);
        return list;        
    }
    void combination(int s, int end,int count,List<Integer> inner, List<List<Integer>> list, int k){
        if(count==k){
            list.add(new ArrayList<>(inner));
            return;
        }
        // if(end-s<k){
        //     return;
        // }
        for(int i=s;i<end+1;i++){
            inner.add(i);
            combination(i+1,end,count+1,inner,list,k);
            inner.remove(inner.size()-1);
        }
    }
}
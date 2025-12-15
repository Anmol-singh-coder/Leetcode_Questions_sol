class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDividingNumber(i)){
                list.add(i);
            }
        }
        return list;
    }

    boolean isSelfDividingNumber(int n){
        if(n<10){
            return true;
        }
        int num=n;
        while(n>0){
            if(n%10==0 || num%(n%10)!=0){
                return false;
            }
            n/=10;
        }
        return true;
    }
}
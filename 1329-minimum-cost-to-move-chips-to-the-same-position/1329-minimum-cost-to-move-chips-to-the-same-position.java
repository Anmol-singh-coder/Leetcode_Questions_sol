class Solution {
    public int minCostToMoveChips(int[] position) {
        // int maxCount=0;
        // int maxCountElement=position[0];
        // for(int i=1;i<position.length;i++){
        //     int count=0;
        //     if(position[i]==position[i-1]){          /// Bahut jyada dimag laga diye Anmol Thoda logic pahle hi soch lete :))
        //         count++;
        //     }else{
        //         count=0;
        //     }
        //     if(maxCount<count){
        //         maxCount=count;
        //         maxCountElement=position[i];
        //     }
        // }
        int coinsEven=0;
        int coinsOdd=0;
        for(int el:position){
            if(el%2==0){
                coinsEven++;
            }else{
                coinsOdd++;
            }
        }
        if(coinsEven>coinsOdd)
            return coinsOdd;
        return coinsEven;
    }
}
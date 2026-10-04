class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minCost=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<prices[minCost]){
                minCost=i;
                continue;
            }
            if(prices[i]-prices[minCost]>profit){
                profit=prices[i]-prices[minCost];
            }
            
        }
        if(minCost==prices.length-1 && profit==0){
            return 0;
        }
        return profit;
    }
}
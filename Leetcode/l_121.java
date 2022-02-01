package Leetcode;
class l_121 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int bp = prices[0];
        for(int i = 1; i < prices.length ; i++){
            int sp = prices[i];
            if(sp>bp){
                profit = Math.max(profit , sp-bp);
            }
            bp = Math.min(sp, bp);
        }
        return profit;
    }
}
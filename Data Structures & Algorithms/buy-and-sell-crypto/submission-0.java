class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int p = 0; p < prices.length; p++){
            int curr = prices[p];
            for(int i = p + 1; i < prices.length; i++){
                int profit = prices[i] - curr;
                if(profit > max){
                    max = profit;
                }
            }
        }
        return max;
    }
}

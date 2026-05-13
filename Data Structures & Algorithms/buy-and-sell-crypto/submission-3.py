class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy_p = 0
        max_profit = 0
        for i,curr in enumerate(prices):
            if i == 0:
                continue
            if(prices[i] <= prices[buy_p]):
                buy_p = i
            else:
                max_profit = max(max_profit,prices[i] - prices[buy_p])

        return max_profit
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        curr_min = sys.maxsize
        max_profit = 0
        for price in prices:
            curr_min = min(curr_min,price)
            profit = price - curr_min
            max_profit = max(profit,max_profit)
        return max_profit

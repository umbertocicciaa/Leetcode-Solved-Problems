class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        buy=0
        sell=1
        currentProfit=0
        profit=0
        # [7,1,5,3,6,4]
        while sell < len(prices):
            currentProfit=prices[sell]-prices[buy]
            if currentProfit + profit > profit:
                profit+=currentProfit
            buy=sell
            sell+=1
        return profit
        
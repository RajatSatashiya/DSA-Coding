class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < prices[i - 1]) {
                continue;
            } else {
                int diff = prices[i] - prices[i - 1];
                ans += diff;
            }
        }
        
        
        return ans;
    }
}
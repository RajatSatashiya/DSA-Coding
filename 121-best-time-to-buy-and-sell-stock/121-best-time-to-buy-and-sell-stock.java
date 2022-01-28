class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int cur = prices[0];
        
        for(int i:prices){
            if(i < cur){
                cur = i;
            }else{
                int diff = i - cur;
                max = (diff > max) ? diff : max;
            }
        }
        return max;
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        int[][] dp = new int[nums.length][2]; //0 -> min   1 -> max
        
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];
        int ans = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < 0) {
                dp[i][1] = Math.max(Math.min(dp[i - 1][0] , dp[i - 1][1]) * nums[i] , nums[i]);
                dp[i][0] = Math.min(Math.max(dp[i - 1][0] , dp[i - 1][1]) * nums[i] , nums[i]);
            } else {
                dp[i][1] = Math.max(Math.max(dp[i - 1][0] , dp[i - 1][1]) * nums[i] , nums[i]);
                dp[i][0] = Math.min(Math.min(dp[i - 1][0] , dp[i - 1][1]) * nums[i] , nums[i]);
            }
            
            ans = Math.max(ans, Math.max(dp[i][0] , dp[i][1]));
        }
        return ans;
    }
}
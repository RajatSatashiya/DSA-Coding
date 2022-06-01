class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        
        return Math.max(dp(nums, 0, n - 2), dp(nums, 1, n-1));
    }
    
    public int dp(int[] nums, int start, int end) {
        int[] dp = new int[nums.length - 1];
        dp[0] = nums[start];
        dp[1] = Math.max(dp[0], nums[start+1]);
        
        for(int i=2; i < dp.length; i++) {
            dp[i] = Math.max(nums[i+start] + dp[i-2] , dp[i-1]);
        }
        return dp[dp.length - 1];
    }
}
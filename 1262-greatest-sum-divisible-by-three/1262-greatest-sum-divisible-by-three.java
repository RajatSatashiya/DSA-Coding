class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        
        for(int i:nums) {
            int a = dp[0], b = dp[1], c = dp[2];
                
            int sum = i + a;
            dp[sum % 3] = Math.max(sum , dp[sum % 3]);
            
            sum = i + b;
            dp[sum % 3] = Math.max(sum , dp[sum % 3]);
            
            sum = i + c;
            dp[sum % 3] = Math.max(sum , dp[sum % 3]);
        }
        return dp[0];
        
        //0 1 2
        
        //0 0 0
        //0 1 0
        //
    }
}

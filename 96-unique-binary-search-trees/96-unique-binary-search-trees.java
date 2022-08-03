class Solution {
    public int numTrees(int n) {
        if(n == 1) return 1;
        
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int j = 2; j <= n; j++) {
            for(int i = 1; i <= j; i++) {
                int left = i - 1;
                int right= j - i;
                dp[j] += (dp[left] * dp[right]);
            }
        }
        
        return dp[n];
    }
}
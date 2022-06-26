class Solution {
    public int countHousePlacements(int n) {
        if(n == 1) {
            return 4;
        }
        long pow = (long)Math.pow(10, 9) + 7;
        long[] dp = new long[n + 1];
        dp[1] = 2;
        dp[2] = 3;
        
        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % pow;
            // System.out.println(dp[i]);
        }
        
        return (int)((dp[n] * dp[n]) % pow);
    }
}


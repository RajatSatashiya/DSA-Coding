class Solution {
    int[] dp;
    public int fib(int n) {
        dp = new int[n + 1];
        return recursion(n);
    }
    
    public int recursion(int n) {
        if(n == 0 || n == 1) {
            dp[n] = n;
            return n;
        }
        if(dp[n] != 0) {
            return dp[n];
        }
        
        dp[n] = recursion(n - 1) + recursion(n - 2);
        return dp[n];
    }
}
class Solution {
    int[] dp;
    Set<Integer> squares = new HashSet<>();
    
    public int numSquares(int n) {
        if(checkSquare(n)) {
            return 1;
        }
        dp = new int[n + 1];
        dynamic(n);
        return dp[n];
    }
    
    public boolean checkSquare(int n) {
        if(squares.contains(n)) {
            return true;
        }
        float num = (float)Math.sqrt(n);
        if(Math.floor(num) == num) {
            squares.add(n);
            return true;
        }
        return false;
    }
    
    public int dynamic(int n) {
        if(n == 1) return 1;
        // if(squares.contains(n) || checkSquare(n)) {
            // dp[n] = 1;
            // return 1;
        // }
        for(int i = 1; i * i <= n; i++) {
            // if(!checkSquare(i)) continue;
            if(dp[n] == 0) dp[n] = Integer.MAX_VALUE;
            
            if(dp[n - (i * i)] != 0 || dp[n - (i * i)] == Integer.MAX_VALUE) {
               dp[n] = Math.min(dp[n], dp[n - (i * i)] + 1);
            } else {
                dp[n] = Math.min(dp[n], dynamic(n - (i * i)) + 1);
            }
        }
        
        return dp[n];
    }
}
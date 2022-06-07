class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        
        int a = 0, b = 0, c = 0;
        int next2 = dp[a] * 2, next3 = dp[b] * 3, next5 = dp[c] * 5;
        
        for(int i = 1; i < n; i++) {
            dp[i] = min(next2, next3, next5);
            
            if(dp[i] == next2) {
                a++;
                next2 = dp[a] * 2;
            }
            if(dp[i] == next3) {
                b++;
                next3 = dp[b] * 3;
            }
            if(dp[i] == next5) {
                c++;
                next5 = dp[c] * 5;
            }
        }
        return dp[n - 1];
    }
    
    public int min(int a, int b, int c){
        if(a <= b && a <= c) {
            return a;
        } else if(b <= a && b <= c) {
            return b; 
        } else {
            return c;
        }
    }
}
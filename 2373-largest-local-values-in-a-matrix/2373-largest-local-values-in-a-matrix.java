class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] ans = new int[grid.length - 2][grid.length - 2];
        
        for(int k = 0; k <= grid.length - 3; k++) {
            for(int p = 0; p <= grid.length - 3; p++) {
                for(int i = k; i < k + 3; i++) {
                    for(int j = p; j < p + 3; j++) {
                        ans[k][p] = Math.max(ans[k][p] , grid[i][j]);
                    }
                }
            }
        }
        return ans;
    }
}

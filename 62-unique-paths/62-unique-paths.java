class Solution {
    int[][] path;
    
    public int uniquePaths(int m, int n) {
        if(m == n && m == 1) return 1;

        path = new int[m][n];
        travel(0, 0, m, n);
        return path[0][0];
    }
    
    public int travel(int i, int j, int m, int n) {
        if(i >= m || j >= n) return 0;
        if(i == m - 1 && j == n - 1) return 1;

        if(path[i][j] != 0) {
            return path[i][j];
        }
        path[i][j] = travel(i, j + 1, m, n) + travel(i + 1, j, m, n);
        
        return path[i][j];
    }
}
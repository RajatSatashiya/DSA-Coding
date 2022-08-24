class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    recurse(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }
    
    public static int[][] dir = new int[][]{{-1,0} , {1,0}, {0,1}, {0,-1}};
    public static void recurse(char[][] grid, int row, int col) {
        grid[row][col] = '0';
        for(int[] i : dir) {
            int nextRow = row + i[0];
            int nextCol = col + i[1];
            
            if(nextRow >= 0 && nextRow < grid.length && nextCol >= 0 && nextCol < grid[0].length && grid[nextRow][nextCol] != '0') {
                recurse(grid, nextRow, nextCol);
            }
        }
        
    }
}
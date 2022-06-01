class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == '1') {
                    change(grid, i, j);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public void change(char[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        change(grid, i, j + 1);
        change(grid, i + 1, j);
        change(grid, i - 1, j);
        change(grid, i, j - 1);
    }
}
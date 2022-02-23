class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0, row = 0, col = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    max = Math.max(max, mega(grid, 0, i, j, visited));
                }
            }
        }
        return max;
    }
    
    public int mega(int[][] grid, int sum, int row, int col, boolean[][] visited){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || visited[row][col] == true
          || grid[row][col] == 0){
            return 0;
        }
        visited[row][col] = true;
       
        sum = 1 + mega(grid, sum, row - 1, col, visited) + mega(grid, sum, row + 1, col, visited) 
            + mega(grid, sum, row, col - 1, visited) + mega(grid, sum, row, col + 1, visited);
        return sum;
    }
}
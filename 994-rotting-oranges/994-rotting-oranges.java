class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        int count = 0;
        int total = 0;
        int m = grid.length;
        int n = grid[0].length;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 2) {
                    q.add(new int[]{i,j});
                    total++;
                } else if(grid[i][j] == 1){
                    total++;
                }
            }
        }
        if(total - q.size() == 0) return 0;
        int initial = q.size();
        int dropped = 0;
        
        int[][] dir = new int[][]{{-1,0}, {0,1}, {1,0}, {0,-1}};
        while(!q.isEmpty()){
            int size = q.size();
            // System.out.println(size);
            for(int i = 0; i < size; i++) {
                int[] point = q.poll();
                
                for(int[] j:dir){
                    int x = point[0] + j[0];
                    int y = point[1] + j[1];
                    
                    if(x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == 0 || grid[x][y] == 2) {
                        continue;
                    }
                    // System.out.println(x + " " + y);
                    grid[x][y] = 2;
                    dropped++;
                    q.add(new int[]{x,y});
                }
            }
            count++;
        }
        return (dropped + initial == total) ? count - 1 : -1;
    }
}

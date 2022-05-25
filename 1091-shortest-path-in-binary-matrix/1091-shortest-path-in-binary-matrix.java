class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,-1},{-1,1},{-1,-1},{1,1}};
        Queue<int[]> q = new LinkedList<>();
        
        if(grid[0][0] == 1) {
            return -1;
        }
        
        int sum = 0;
        q.add(new int[]{0,0});
        grid[0][0] = 1;
        
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0) {
                int[] pop = q.poll();
                if(pop[0] == grid.length - 1 && pop[1] == grid[0].length - 1) {
                    return sum + 1;
                }
                
                for(int i=0; i<8; i++) {
                    int nextX = pop[0] + dir[i][0];
                    int nextY = pop[1] + dir[i][1];
                    
                    if(nextX>=0 && nextX<grid.length && nextY>=0 && nextY<grid[0].length && grid[nextX][nextY]==0) {
                        q.add(new int[]{nextX,nextY});
                        grid[nextX][nextY] = 1;    
                    }
                }
            }
            sum++;
        }
        return -1;
    }
}
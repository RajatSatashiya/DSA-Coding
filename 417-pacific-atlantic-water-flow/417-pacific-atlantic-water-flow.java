class Solution {
    List<List<Integer>> ans = new LinkedList<>();
    boolean[][] pacific;      
    boolean[][] atlantic;
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        pacific = new boolean[heights.length][heights[0].length];    
        atlantic = new boolean[heights.length][heights[0].length];         
        
        for(int i=0; i<heights.length; i++) {
            dfs(heights, pacific, i, 0);
            dfs(heights, atlantic, i, heights[0].length - 1);
        }
        
        for(int i=0; i<heights[0].length; i++) {
            dfs(heights, pacific, 0, i);
            dfs(heights, atlantic, heights.length - 1, i);
        }
        
        // for(boolean[] i: atlantic){
        //     for(boolean j:i){
        //         System.out.print(" " + j);
        //     }
        //     System.out.println();
        // }
        
        // for(boolean[] i: atlantic){
        //     for(boolean j:i){
        //         System.out.print(" " + j);
        //     }
        //     System.out.println();
        // }
        
        return ans;
    }
    
    int[][] dir = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
    public void dfs(int[][] heights, boolean[][] checked, int r, int c) {
        if(checked[r][c]) return;
        checked[r][c] = true;
        
        if(atlantic[r][c] && pacific[r][c]) {
            List<Integer> li = new LinkedList<>();
            li.add(r); li.add(c);
            ans.add(new LinkedList<>(li));
        }
        
        for(int[] i:dir) {
            int nextRow = r + i[0];
            int nextCol = c + i[1];
            
            if(nextRow < 0 || nextCol < 0 || nextRow >= heights.length || nextCol >= heights[0].length || heights[nextRow][nextCol] < heights[r][c]) {
                continue;
            }
            dfs(heights, checked, nextRow, nextCol);
        }
    }
}


// 00 01
// 10 11
// 20 21
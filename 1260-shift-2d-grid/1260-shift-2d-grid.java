class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length, col = grid[0].length;
        int start = row * col - k % (row * col);
        LinkedList<List<Integer>> arr = new LinkedList<>();
        
        for(int i = start; i < row * col + start; i++){
            int j = i % (row * col),
            r = j / col, c = j % col;
            
            if((i-start) % col == 0){
                arr.add(new ArrayList<>());
            }
            arr.peekLast().add(grid[r][c]);
        }
        return arr;        
    }
}
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int[][] dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        List<Integer> li = new ArrayList<>();
        int index = 0;
        int row = 0, col = 0;
        
        while(li.size() != matrix.length * matrix[0].length) {
            li.add(matrix[row][col]);
            matrix[row][col] = 200;
            
            int nr = row + dir[index][0];
            int nc = col + dir[index][1];
            if(nr >= matrix.length || nc >= matrix[0].length || nr < 0 || nc < 0 || matrix[nr][nc] == 200) {
                index = (index + 1) % dir.length;
                row += dir[index][0];
                col += dir[index][1];
            } else {
                row = nr;
                col = nc;
            }
        }
        
        return li;
    }
}
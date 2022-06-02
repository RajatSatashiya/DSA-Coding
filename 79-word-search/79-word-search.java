class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] checked = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(backtracking(board, i, j, 0, word, checked)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    int[][] dir = new int[][]{{0,-1}, {-1,0}, {0,1}, {1,0}};
    public boolean backtracking(char[][] board, int i, int j, int index, String word, boolean[][] checked) {
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index) || checked[i][j]) {
            return false;
        }
        if(index == word.length() - 1) return true;
        
        //backtracking template -> choose-explore-unchoose
        
        //choose
        checked[i][j] = true;
        
        //explore
        for(int[] k:dir){
            if(backtracking(board, i + k[0], j + k[1], index + 1, word, checked)){
                return true;
            }
        }
        
        //unchoose
        checked[i][j] = false;
        return false;
    }
}
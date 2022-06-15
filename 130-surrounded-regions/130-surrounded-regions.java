class Solution {
    public void solve(char[][] board) {
        int row = 0, col = 0;
        
        for(int i = 0; i < board[0].length; i++) {
            if(board[0][i] == 'O') {
                change(board, 0, i);
            }
        }
        for(int i = 0; i < board[0].length; i++) {
            if(board[board.length - 1][i] == 'O') {
                change(board, board.length - 1, i);
            }
        }
        for(int i = 0; i < board.length; i++) {
            if(board[i][0] == 'O') {
                change(board, i, 0);
            }
        }
        for(int i = 0; i < board.length; i++) {
            if(board[i][board[0].length - 1] == 'O') {
                change(board, i, board[0].length - 1);
            }
        }
        
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                board[i][j] = (board[i][j] == '1') ? 'O': 'X';
            }
        }
    }
    public void change(char[][] board, int row, int col)  {
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] == '1') {
            return;
        }
        if(board[row][col] == 'X') {
            return;
        } else {
            board[row][col] = '1';
        }
        
        change(board, row - 1, col);
        change(board, row, col + 1);
        change(board, row + 1, col);
        change(board, row, col - 1);
    }
}
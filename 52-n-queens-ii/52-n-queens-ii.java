class Solution {
    public int ans = 0;
    public int totalNQueens(int n) {
        int[][] mat = new int[n][n];
        
        for(int i=0; i<n; i++) {
            backtrack(mat, n, 0, i);
        }
        return ans;
    }
    
    
    private boolean backtrack(int[][] mat, int n, int row, int col) {
        if(row == n) {
            return true;
        }

        //check column & row
        for(int i=0; i<n; i++){
            if(mat[row][i] == 1 || mat[i][col] == 1){
                return false;
            };
        };
        
        //check diagonals
        boolean diag= true;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                if(Math.abs(i-row) == Math.abs(j-col) && mat[i][j] == 1) {
                    return false;
                }  
            }
        }
        
        //choose
        mat[row][col] = 1;
        //explore
        for(int column = 0; column < n; column++){
            if(backtrack(mat, n, row + 1, column)) {
                ans++;
                break;
            }
        }
        
        //unchoose
        mat[row][col] = 0;
        return false;
    }
    
    // private List<String> construct(int[][] board) {
    //     List<String> res2 = new LinkedList<String>();
    //     for(int[] i:board){
    //         String str = "";
    //         for(int j:i){
    //             if(j==0) str += ".";
    //             else str += "Q";
    //         }
    //         res2.add(str);
    //     }
    //     return res2;
    // }
}
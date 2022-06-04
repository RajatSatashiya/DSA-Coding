class Solution {
    public List<List<String>> solveNQueens(int n) {
        int[][] mat = new int[n][n];
        
        List<List<String>> res = new ArrayList<>();
        for(int i=0; i<n; i++) {
            backtrack(mat, n, res, 0, i);
        }
        return res;
    }
    
    
    private boolean backtrack(int[][] mat, int n, List<List<String>> res, int row, int col) {
        if(row == n) {
            // res.add(construct(mat));
            // mat[row][col] = 0;
            return true;
        }
        // System.out.println(row + " " + col);
        
//         if(row == 2 && col == 0 && mat[1][3] == 1 && mat[0][1] == 1) {
//             for(int i=0; i<n; i++){
//                 for(int j=0; j<n; j++){
//                     System.out.print(mat[i][j] + " ");
//                 }
//                 System.out.println();
//             }
//         }
        
        //check column & row
        for(int i=0; i<n; i++){
            if(mat[row][i] == 1 || mat[i][col] == 1){
                // mat[row][col] = 0;
                return false;
            };
        };
        
        //check diagonals
        boolean diag= true;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                if(Math.abs(i-row) == Math.abs(j-col) && mat[i][j] == 1) {
                    // mat[row][col] = 0;
                    // System.out.println("hello: " + i + " " + j + " " + mat[i][j]);
                    return false;
                }//20 -> 02 11 31 (13)   
            }
        }
        
        //choose
        mat[row][col] = 1;
        // System.out.println(mat[row][col]);
        
        //explore
        for(int column = 0; column < n; column++){
            if(backtrack(mat, n, res, row + 1, column)) {
                res.add(construct(mat));
                break;
                // mat[row][col] = 0;
            }
        }
        
        //unchoose
        mat[row][col] = 0;
        return false;
    }
    
    private List<String> construct(int[][] board) {
        List<String> res2 = new LinkedList<String>();
        for(int[] i:board){
            String str = "";
            for(int j:i){
                if(j==0) str += ".";
                else str += "Q";
            }
            res2.add(str);
        }
        return res2;
    }
}
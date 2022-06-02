class Solution {
    public int[][] transpose(int[][] matrix) {
        //00 01 02 ->  00 01
        //10 11 12 ->  10 11
        //         ->  20 21
        int[][] ans = new int[matrix[0].length][matrix.length];
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}
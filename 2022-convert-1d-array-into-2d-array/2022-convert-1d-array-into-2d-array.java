class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m * n != original.length) return new int[][]{};
        
        int[][] ans = new int[m][n];
        int index = 0;
        
        //main program
        for(int i = 0; i < original.length; i++) {
            ans[i / n][i % n] = original[i];
        }
        
        //output
        return ans;
    }
}
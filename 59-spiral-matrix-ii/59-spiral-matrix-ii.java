class Solution {
    public int[][] generateMatrix(int n) {
        boolean[][] arr = new boolean[n][n];
        int num = 1, row = 0, col = -1;
        int[][] ans = new int[n][n];
        char dir = 'r';
        
        while(num <= n * n){
            if(dir == 'r'){
                if((col + 1 == n) || arr[row][col+1]){
                    dir = 'd';  
                    row++;
                } else {
                    col++;
                }
            } else if(dir == 'd'){
                if(row + 1 == n || arr[row + 1][col]){
                    dir = 'l';
                    col--;
                } else {
                    row++;
                }
            } else if(dir == 'l'){
                if(col - 1 < 0 || arr[row][col-1]){
                    dir = 'u';
                    row--;
                } else {
                    col--;
                }
            } else {
                if(row - 1 < 0 || arr[row-1][col]) {
                    dir = 'r';
                    col++;
                } else {
                    row--;
                }
            }
            ans[row][col] = num;
            arr[row][col] = true;
            num++;
        }
        return ans;
    }
}
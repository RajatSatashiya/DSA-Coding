class Solution {
    public int[][] diagonalSort(int[][] mat) {
        //00 01 02 03
        //10 11 12 13
        //20 21 22 23
        
        //03
        //02 13
        //01 12 23
        //00 11 22
        //10 21
        //20
        
        int rows = mat.length;
        int cols = mat[0].length;
        
        int i = 0, j = cols - 1;
        boolean flag = true;
        while(i < rows) {
            //03
            int r = i, c = j;
            ArrayList<Integer> arr = new ArrayList<>();
            while(r < rows && c < cols) {
                arr.add(mat[r][c]);
                r++; c++;
            }
            Collections.sort(arr);
            
            //re-fill the original array
            r = i; c = j;
            while(r < rows && c < cols) {
                mat[r][c] = arr.get(0);
                arr.remove(0);
                r++; c++;
            }
            // System.out.println(i + " " + j);
            
            if(i == 0 && j == 0) {
                flag = false;
            }
            
            if(flag) {
                j--;
            } else {
                i++;
            }
        }
        
        return mat;
    }
}
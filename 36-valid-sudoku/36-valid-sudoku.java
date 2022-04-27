class Solution {
    public boolean isValidSudoku(char[][] board) {
        return (checkCol(board) && checkRow(board) && checkBox(board));
    }
    
    public boolean checkRow(char[][] board){
        for(char[] ch:board){
            boolean[] arr = new boolean[9];
            for(char temp:ch){
                if(temp != '.'){
                    if(arr[temp - '0' - 1]){
                        return false;  
                    } else {
                        arr[temp - '0' - 1] = true;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean checkCol(char[][] board){
        for(int i=0; i<9; i++){
            boolean[] arr = new boolean[9];
            for(int j=0; j<9; j++){
                char temp = board[j][i];
                if(temp != '.'){
                    if(arr[temp - '0' - 1]){
                        return false;  
                    } else {
                        arr[temp - '0' - 1] = true;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean checkBox(char[][] board){
        //00 01 02, 10 11 12, 20 21 22
        //03 04 05, 13 14 15, 23 24 25
        //
        
        //30 31 32, 40 41 42, 50 51 52
        int count = 0, sum = 0, done = 0;
        boolean[] arr = new boolean[9];
        for(int i=0; i<3; i++){
            for(int j=count; j<count+3; j++){
                sum++;
                char temp = board[i][j];
                if(temp != '.'){
                    if(arr[temp - '0' - 1]){
                        return false;  
                    } else {
                        arr[temp - '0' - 1] = true;
                    }
                }
            }
            if(sum == 9){
                sum = 0;
                i = -1;
                count += 3;
                done++;
                Arrays.fill(arr,false);
            }
            if(done == 3) break;
        }
        
        count = 0; sum = 0; done = 0;
        boolean[] arr2 = new boolean[9];
        for(int i=3; i<6; i++){
            for(int j=count; j<count+3; j++){
                char temp = board[i][j];
                if(temp != '.'){
                    if(arr2[temp - '0' - 1]){
                        return false;  
                    } else {
                        arr2[temp - '0' - 1] = true;
                    }
                }
                sum++;
            }
            if(sum == 9){
                sum = 0;
                i = 2;
                count += 3;
                done++;
                Arrays.fill(arr2,false);
            }
            if(done == 3) break;
        }
        
        count = 0; sum = 0; done = 0;
        boolean[] arr3 = new boolean[9];
        for(int i=6; i<9; i++){
            for(int j=count; j<count+3; j++){
            
                char temp = board[i][j];
                if(temp != '.'){
                    if(arr3[temp - '0' - 1]){
                        return false;  
                    } else {
                        arr3[temp - '0' - 1] = true;
                    }
                }
                sum++;
            }
            if(sum == 9){
                sum = 0;
                i = 5;
                count += 3;
                done++;
                Arrays.fill(arr3,false);
            }
            if(done == 3) break;
        }
        return true;
    }
}
 




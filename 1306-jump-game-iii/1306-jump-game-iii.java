class Solution {
    boolean flag = false;
    boolean[][] checked;
    
    public boolean canReach(int[] arr, int start) {
        checked = new boolean[arr.length][2];
        flag = check(arr, start);
        return flag;
    }
    
    public boolean check(int[] arr, int cur) {
        if(arr[cur] == 0) {
            return true;
        }
        
        int num1 = arr[cur] + cur;
        int num2 = cur - arr[cur];
        //left -> 0, right -> 1
        
        if(num1 <= arr.length - 1 && num1 >= 0 && !checked[cur][1]) {
            checked[cur][1] = true;
            if(check(arr, num1)) {
                return true;
            }
        }
        
        if(num2 <= arr.length - 1 && num2 >= 0 && !checked[cur][0]) {
            checked[cur][0] = true;
            if(check(arr, num2)) {
                return true;
            }
        }
        return false;
    }
}
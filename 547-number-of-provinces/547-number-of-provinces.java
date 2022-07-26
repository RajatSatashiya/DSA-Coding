class Solution {
    boolean[] checked;
    public int findCircleNum(int[][] isConnected) {
        checked = new boolean[isConnected.length];
        
        int ans = 0;
        for(int i = 0; i < isConnected.length; i++) {
            if(!checked[i]) {
                check(isConnected, i);
                ans++;
            }
        }
        
        return ans;
    }
    
    public void check(int[][] conn, int index) {
        if(checked[index]) {
            return;
        }
        checked[index] = true;
        for(int i = 0; i < conn[index].length; i++) {
            if(!checked[i] && index != i && conn[index][i] == 1) {
                check(conn, i);
            }
        }
    }
}
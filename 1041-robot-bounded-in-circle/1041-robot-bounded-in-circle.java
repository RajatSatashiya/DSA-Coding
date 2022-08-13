class Solution {
    public boolean isRobotBounded(String str) {
        int[][] dir = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
        
        int x = 0;
        int y = 0;
        int index = 0; // 0 -> N,  1 -> E,  2 -> S, 3 -> W
        
        //GGLLGG
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // System.out.println(index);
            if(ch == 'G') {
                x = x + dir[index][0];
                y = y + dir[index][1];
            } else if (ch == 'R') {
                index = (index + 1) % 4;
            } else {
                index = (index - 1 + 4) % 4;
            }
        }
        
        if(x == 0 && y == 0) {
            return true;
        }
        
        if(index != 0) {
            return true;
        }
        
        return false;
    }
}
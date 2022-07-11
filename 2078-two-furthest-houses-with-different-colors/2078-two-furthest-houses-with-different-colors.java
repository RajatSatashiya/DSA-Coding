class Solution {
    public int maxDistance(int[] colors) {
        int lo = 0;
        int hi = colors.length - 1;
        
        int left = 0, right = 0;
        
        while(colors[lo] == colors[hi]) {
            hi--;
        }
        left = hi - lo;
        
        lo = 0;
        hi = colors.length - 1;
        while(colors[lo] == colors[hi]) {
            lo++;
        }
        right = hi - lo;
        
        return Math.max(left, right);
    }
}
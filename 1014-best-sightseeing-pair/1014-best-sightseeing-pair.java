class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans = Integer.MIN_VALUE;
        int maxval = values[0] + 0;
        
        for(int i = 1; i < values.length; i++) {
            ans = Math.max(ans, maxval + values[i] - i);
            maxval = Math.max(maxval, values[i] + i);
        }
        
        return ans;
    }
}
class Solution {
    public int maxProfit(int[] p) {
        int cur = p[0], ans = 0;
        
        for(int i=1; i<p.length; i++){
            if(p[i] < p[i-1]){
               cur = p[i];
            } else{
                int diff = p[i] - p[i-1];
                ans += diff;
            }
        }
        return ans;
    }
}
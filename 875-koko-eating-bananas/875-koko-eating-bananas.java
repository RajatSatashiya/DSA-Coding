class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1, hi = 1;
        
        for(int i:piles) {
            hi = Math.max(hi, i);
        }
        
        while(lo < hi) {
            int mid = lo + (hi - lo) / 2;
            boolean check;
            int time = 0;
            
            for(int i = 0; i < piles.length; i++) {
                if(piles[i] % mid == 0) {
                    time += piles[i] / mid;
                } else {
                    time += (piles[i] / mid) + 1;
                }
            }
            if(time <= h) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
//3, 6, 7, 11
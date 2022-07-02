class Solution {
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        Arrays.sort(hc);
        Arrays.sort(vc);
        
        long maxHinterval = 0;
        long maxVinterval = 0;
        long prevH = 0;
        long prevV = 0;
        
        for(int i = 0; i < hc.length; i++) {
            maxHinterval = Math.max(maxHinterval, hc[i] - prevH);
            prevH = hc[i];
        }
        
        for(int i = 0; i < vc.length; i++) {
            maxVinterval = Math.max(maxVinterval, vc[i] - prevV);
            prevV = vc[i];
        }
        long pow = (long) Math.pow(10, 9) + 7;
        
        maxHinterval = Math.max(maxHinterval, h - prevH) % pow;
        maxVinterval = Math.max(maxVinterval, w - prevV) % pow;
        
        return (int) ((maxHinterval * maxVinterval) % pow);
    }
}
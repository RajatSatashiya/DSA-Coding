class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int lo = 0, hi = lo + k - 1;
        Double sum = 0.0, avg = Double.valueOf(Integer.MIN_VALUE);
        
        for(int i=lo; i <= hi; i++) {
            sum += nums[i];
        }
        avg = Math.max(avg, sum / k);
        hi++;
        while(hi != nums.length) {
            sum -= nums[lo];
            lo++;
            sum += nums[hi];
            hi++;
            avg = Math.max(avg, sum / k);
        }
        
        return avg;
    }
}
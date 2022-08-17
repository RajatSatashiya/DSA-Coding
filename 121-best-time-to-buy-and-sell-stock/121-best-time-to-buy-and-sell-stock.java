class Solution {
    public int maxProfit(int[] nums) {
        int max = 0;
        int cur = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < cur) {
                cur = nums[i];
            } else {
                max = Math.max(max, nums[i] - cur);
            }
        }
        
        return max;
    }
}
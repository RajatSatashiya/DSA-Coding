class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int index = nums.length - 1;
        int sum = 0;
        
        return dp(nums, target, index, sum);
    }
    
    public int dp(int[] nums, int target, int index, int sum) {
        if(index < 0 && sum == target) {
            return 1;
        }
        if(index < 0) return 0;
        
        int pos = dp(nums, target, index - 1, sum + nums[index]);
        int neg = dp(nums, target, index - 1, sum - nums[index]);
        
        return pos + neg;
    }
}
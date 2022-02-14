class Solution {
    public int[] twoSum(int[] nums, int t) {
        int[] ans = new int[2];
        int lo = 0, hi = nums.length - 1;
        
        while(lo < hi){
            int sum = nums[lo] + nums[hi];
            if(sum == t){
                ans[0] = lo + 1;
                ans[1] = hi + 1;
                return ans;
            }
            if(sum > t){
                hi--;
            } else {
                lo++;
            }
        }
        return ans;
    }
}
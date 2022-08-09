class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int temp = 0;
        
        for(int i = 0; i < nums.length; i++) {
            temp += nums[i];
            if(temp > ans) {
                ans = temp;
            } 
            if(temp < 0) {
                temp = 0;
            }
        }
        
        return ans;
    }
}
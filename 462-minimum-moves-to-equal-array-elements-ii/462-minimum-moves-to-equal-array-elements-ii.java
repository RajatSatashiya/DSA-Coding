class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = (nums.length) / 2;
        int num = nums[mid];
        int ans = 0;
        
        for(int i = 0; i < nums.length; i++) {
            ans += Math.abs(num - nums[i]);
        }
        return ans;
    }
}


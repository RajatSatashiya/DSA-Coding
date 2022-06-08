class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1 || nums[nums.length - 1] > nums[0]) return nums[0];
        
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1]) {
                return nums[i+1];
            }
        }
        
        return nums[nums.length - 1];
    }
}
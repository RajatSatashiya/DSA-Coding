class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums[nums.length - 1] > nums[0]) return nums[0];
        
        int i = 0;
        for(i=0; i < nums.length - 1; i++) {
            if(nums[i] <= nums[i+1]) {
                continue;
            } else {
                return nums[i+1];
            }
        }
        
        return nums[i];
    }
}
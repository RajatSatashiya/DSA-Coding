class Solution {
    public int missingNumber(int[] nums) {
        
        for(int i=0; i<nums.length; i++) {
            if(Math.abs(nums[i]) < nums.length) {
                if(nums[Math.abs(nums[i])] == 0) {
                    nums[Math.abs(nums[i])] = (nums.length + 2) * (-1);
                    nums[0] = (nums.length + 2) * (-1);
                    continue;
                }
                nums[Math.abs(nums[i])] *= -1;
            }
        }
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] >= 0) {
                return i;
            }
        }
        return nums.length;
    }
}
class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        
        while(i <= nums.length - 2 && nums[i] <= nums[i+1]){
            i++;
        }
        return (i == nums.length - 1) ? nums[0] : nums[i+1];
    }
}
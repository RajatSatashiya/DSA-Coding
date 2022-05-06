class Solution {
    public int findDuplicate(int[] nums) {
        //[1,3,4,2,2]
        
        for(int i:nums){
            if(nums[Math.abs(i)] < 0) return Math.abs(i);
            nums[Math.abs(i)] = -1 * nums[Math.abs(i)];
        }
        
        return -1;
    }
}
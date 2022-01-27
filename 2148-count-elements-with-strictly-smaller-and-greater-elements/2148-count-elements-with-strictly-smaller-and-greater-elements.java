class Solution {
    public int countElements(int[] nums) {
        int min = nums[0], max = nums[0];
        
        for(int i:nums){
            min = (i < min) ? i : min;
            max = (i > max) ? i : max;
        }
        
        int count = 0;
        for(int i:nums){
            count += (i > min && i < max) ? 1 : 0;
        }
        return count;
    }
}
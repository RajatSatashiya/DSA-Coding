class Solution {
    public int findKthLargest(int[] nums, int k) {
        //SELECTION SORT
        for(int i = 0; i < nums.length - 1; i++) {
            int index = 0;
            int min = nums[i];
            
            for(int j = i; j < nums.length; j++) {
                min = Math.min(min, nums[j]);
                if(min == nums[j]) {
                    index = j;
                }
            }
            
            int temp = nums[i];
            nums[i] = min;
            nums[index] = temp;
        }
        
        return nums[nums.length - k];
    }
}
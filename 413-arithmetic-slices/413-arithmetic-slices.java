class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3) return 0;
        int count = 0, diff = nums[1] - nums[0], len = 2;
        
        for(int i = 2; i < nums.length; i++) {
            if(nums[i] - nums[i-1] == diff) {
                len++;
                continue;
            } else {
                // System.out.println(nums[i]);
                len = len - 2;
                count += (len * (len + 1)) / 2;
                len = 2;
                // if(i < nums.length - 1){
                //     diff = nums[i+1] - nums[i];
                //     i++;
                // }
                diff = nums[i] - nums[i-1];
            }
        }
        len = len - 2;
        count += (len * (len + 1)) / 2;       
        
        // [1,2,3,4,5,3,6,9,12]
        //[48,-47,-43,9,14,36,33,9,-7,23,18,13,21,-6,5,-49,38,30,221,42,30,5,-33,48,-39,3]
        return count;
    }
}
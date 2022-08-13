class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        
        for(int i = 0; i < nums.length - 2; i++) {
            int lo = nums[i];
            int count = 0;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] - lo > diff) break;
                if(nums[j] - lo == diff) {
                    count++;
                    lo = nums[j];
                }
                if(count == 2) break;
            }
            if(count == 2) {
                ans++;
            }
        }
        
        return ans;
    }
}
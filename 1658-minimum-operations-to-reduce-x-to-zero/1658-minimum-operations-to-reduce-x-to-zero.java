class Solution {
    public int minOperations(int[] nums, int x) {
        //6
        int needed = 0;
        for(int i:nums){
            needed += i;
        }
        needed = needed - x;
        
        int maxLength = -1, currSum = 0;
        for (int l=0, r=0; r < nums.length; r++) {
            currSum += nums[r];
            
            while (l <= r && currSum > needed) currSum -= nums[l++];
            if (currSum == needed) maxLength = Math.max(maxLength, r-l+1);
        }
        
        return maxLength == -1 ? -1 : nums.length - maxLength;
    }
}
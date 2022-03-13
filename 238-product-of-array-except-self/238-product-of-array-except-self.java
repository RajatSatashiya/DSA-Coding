class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, count = 0;
        boolean isZero = false;
        int[] ans = new int[nums.length];
        
        for(int i:nums){
            if(i != 0){
                prod *= i;
            } else { 
                count++;
                isZero = true;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(count >= 2){
                ans[i] = 0;
                continue;
            }
            if(isZero && nums[i] != 0){
                ans[i] = 0;
                continue;
            }
            if(nums[i] == 0){
                ans[i] = prod;
            } else {
                ans[i] = prod / nums[i];
                // System.out.println(ans[i]);
            }
        }
        return ans;
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        
        for(int i=1; i<nums.length; i++) {
            
            int a = max * nums[i];
            int b = min * nums[i];
            
            max = max(a, b, nums[i]);
            min = min(a, b, nums[i]);
            
            ans = Math.max(ans, max);
        }
        return ans;
    }
    
    public int max(int a, int b, int c) {
        return Math.max(Math.max(a,b), c);
    }
    
    public int min(int a, int b, int c) {
        return Math.min(Math.min(a,b), c);
    }
}
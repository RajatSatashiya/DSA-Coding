class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        
        for(int i=0; i < nums.length; i++) {
            map.put(nums[i],false);
        }
        
        int lo = 0, hi = 0, sum = 0, ans = 0;
        while(lo <= hi && hi < nums.length){
            if(!map.get(nums[hi])) {
                sum += nums[hi];
                ans = Math.max(ans, sum);
                map.put(nums[hi], true);
                hi++;
            } else {
                sum -= nums[lo];
                map.put(nums[lo], false);
                lo++;
                
            }
        }
        return ans;
    }
}
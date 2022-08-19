class Solution {
    public boolean isPossible(int[] nums) {
        //[1,2,3,3,4,4,5,5]
        
        Map<Integer, Integer> want = new HashMap<>();
        Map<Integer, Integer> occ = new HashMap<>();
        for(int i : nums){
            occ.put(i, occ.getOrDefault(i, 0) + 1);
        }
        
        // 1        
        for(int i = 0; i < nums.length; i++) {
            if(occ.get(nums[i]) <= 0) {
               continue;
            }
            
            // if(want.getOrDefault(nums[i], 0) > 0) {
            if(want.getOrDefault(nums[i], 0) > 0) {
                occ.put(nums[i] , occ.get(nums[i]) - 1);
                want.put(nums[i] , want.get(nums[i]) - 1);
                want.put(nums[i] + 1, want.getOrDefault(nums[i] + 1, 0) + 1);
            } else {
                if(occ.getOrDefault(nums[i], 0) > 0 && occ.getOrDefault(nums[i] + 1, 0) > 0 && occ.getOrDefault(nums[i] + 2, 0) > 0) {
                    occ.put(nums[i] , occ.get(nums[i]) - 1);
                    occ.put(nums[i] + 1, occ.get(nums[i] + 1) - 1);
                    occ.put(nums[i] + 2, occ.get(nums[i] + 2) - 1);
                    
                    want.put(nums[i] + 3, want.getOrDefault(nums[i] + 3, 0) + 1);
                } else {
                    return false;
                }
            }
        }
        
        return true;
    }
}
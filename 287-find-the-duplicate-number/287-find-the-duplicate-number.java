class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        int prev = 0;
        for(int i:nums){
            if(i == prev) return prev;
            prev = i;
        }
        return 0;
    }
}
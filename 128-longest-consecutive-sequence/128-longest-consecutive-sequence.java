class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        //0, 1, 1, 2
        
        int max = Integer.MIN_VALUE, cnt = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                cnt++;
            } else if (nums[i] == nums[i-1]) {
                continue;
            } else {
                max = (max < cnt) ? cnt : max;
                cnt = 1;
            }
        }
        max = (max < cnt) ? cnt : max;
        return max;
    }
}
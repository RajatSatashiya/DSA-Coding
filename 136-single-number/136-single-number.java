class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int ans = 0;
        //1,1,2,2,4
        for(int i=0; i<nums.length; i+=0){
            if(i == nums.length-1){
                ans = nums[i];
                break;
            }
            if(nums[i] == nums[i+1]){
                i = i + 2;
            } else {
                ans = nums[i];
                break;
            }
        }
        return ans;        
    }
}
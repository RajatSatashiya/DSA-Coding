class Solution {
    public int removeElement(int[] nums, int val) {
        int ans = 0;
        int index = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                nums[i] = 200;
            }else{
                nums[index] = nums[i];
                index++;
                ans++;
            }
        }
        return ans;
    }
}
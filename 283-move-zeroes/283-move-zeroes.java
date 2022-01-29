class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;
        
        for(int i:nums){
            if(i != 0){
                nums[pos] = i;
                pos++;
            }
        }
        
        for(int i=pos; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}
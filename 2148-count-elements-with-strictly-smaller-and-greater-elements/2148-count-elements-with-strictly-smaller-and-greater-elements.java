class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        
        //-3,3,3,90
        
        int count = 0;
        for(int i=1; i<nums.length-1; i++){
            int cur = nums[i];
            if(nums[0] < cur && cur < nums[nums.length-1]){
                count++;
            }
        }
        return count;
    }
}
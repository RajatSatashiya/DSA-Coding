class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        
        //-3,3,3,90
        
        int count = 0;
        int smallest = nums[0];
        int largest = nums[nums.length-1];
        for(int i=1; i<nums.length-1; i++){
            if(smallest < nums[i] && nums[i] < largest){
                count++;
            }
        }
        return count;
    }
}
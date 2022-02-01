class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        
        for(int i=1; i<nums.length; i++){
            int temp = nums[i];
            int j = i - 1;
            
            while(j >=0 && temp < nums[j]){
                nums[j+1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        return nums;
    }
}
class Solution {
    public int candy(int[] nums) {
        int[] left = new int[nums.length];
        int[] right= new int[nums.length];
        
        //fill all with 1
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        
        //left to right
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                left[i] = left[i-1] + 1;
            }
        }
        

        //right to left
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] > nums[i+1]) {
                right[i] = right[i+1] + 1;
            }
        }
        
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            // System.out.println(left[i] + " " + right[i]);
            ans += Math.max(left[i], right[i]);
        }
        
        return ans;
    }
}
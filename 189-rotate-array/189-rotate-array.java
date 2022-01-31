class Solution {
    public void rotate(int[] nums, int k) {
        int[] nums2 = new int[nums.length];
        
        k = k % nums.length;
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            int pos = (i + k) % nums.length;
            nums2[pos] = val;
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = nums2[i];
        }
    }
}
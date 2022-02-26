class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length - 1);
        return nums;
    }
    
    public void divide(int[] nums, int start, int end) {
        if(start >= end) {
            return;
        }
        
        int mid = start + (end - start) / 2;
        divide(nums, start, mid);
        divide(nums, mid + 1, end);
        conquer(nums, start, mid, end);
    }
    
    public void conquer(int[] nums, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];

        // System.out.println("start: " + start + " mid: " + mid + " end: " + end);
        int i = start, j = mid + 1;
        int idx = 0;
        while(i <= mid && j <= end) {
            if(nums[i] > nums[j]) {
                merged[idx++] = nums[j++];
            } else {
                merged[idx++] = nums[i++];
            }
            
            // if(nums[i] <= nums[j]) {
            //     merged[idx++] = nums[i++];
            // } else {
            //     merged[idx++] = nums[j++];
            // }
        }
        
        while(i <= mid) {
            merged[idx++] = nums[i++];
        }
        
        while(j <= end) {
            merged[idx++] = nums[j++];
        }
        
        for(int f = 0; f < merged.length; f++){
            nums[start++] = merged[f];
        }
    }
}
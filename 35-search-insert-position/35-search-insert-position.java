class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        
        //[1,3,5,6,7,10,13,20]
        // 8
        while(lo < hi){
            int mid = lo + (hi - lo) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target){
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        if(nums[lo] < target) return lo+1;
        else return lo;
    }
}
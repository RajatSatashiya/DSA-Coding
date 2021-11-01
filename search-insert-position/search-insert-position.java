class Solution {
    public static int searchInsert(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		int mid = (l+r)/2;

		while(l <= r && nums[mid] != target) {
			if(nums[mid] > target) {
				r = mid-1;
				mid = (l+r)/2;
			}else {
				l = mid+1;
				mid = (l+r)/2;
			}
		}
		if(nums[mid] == target || nums[mid]>target) {
			return mid;
		}else {
			return mid+1;
		}
	}
}
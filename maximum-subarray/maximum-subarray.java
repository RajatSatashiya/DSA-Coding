class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
		int sum = nums[0];
		int max = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			int cur = nums[i];
			if(sum < 0 && cur > sum) {
				sum = cur;
				if(sum > max) max = sum;
//				System.out.println(max + " this -> " + sum);
			}else {
				sum += cur;
				max = (sum > max) ? sum : max;
//				System.out.println(max + " that -> " + sum);
			}
		}
		return max;
    }
}
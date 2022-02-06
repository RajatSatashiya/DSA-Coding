class Solution {
    public int removeDuplicates(int[] nums) {
        /*
            Input: nums = [1,1,1,2,2,3]
            Output: 5, nums = [1,1,2,2,3,_]
        */
        int ans = nums.length, cmp = nums[0] - 1;
        int temp = Integer.MIN_VALUE, count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != temp) {
                temp = nums[i];
                count = 0;
            } else {
                count++;
                if(count >= 2){
                    ans--;
                    nums[i] = cmp;
                }
            }
        }
        boolean flag = true;
        int pos = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == cmp){
                flag = false;
                continue;
            }
            if(nums[i] != cmp && !flag){
                nums[pos] = nums[i];
                pos++;
                continue;
            }
            pos++;
        }
        
        return ans;
    }
}
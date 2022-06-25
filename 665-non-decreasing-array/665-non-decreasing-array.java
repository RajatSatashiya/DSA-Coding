class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        int prev = Integer.MIN_VALUE;
        int index = -1;
        int abNormal = -1;
        
        for(int i = 0; i < nums.length - 1; i++) {
            boolean flag = false;
            if(nums[i] > nums[i+1]){
                count++;
                flag = true;
                abNormal = i;
                if(count > 1) return false;
            }
            
            if(index == i) {
                continue;
            }

            if(flag) {
                if(nums[i+1] >= prev) {
                    prev = nums[i+1];
                } else {
                    prev = nums[i];
                }
                index = i + 1;
            } else {
                if(nums[i] >= prev) {
                    prev = nums[i];
                } else {
                    return false;
                }
            }
        }
        if(abNormal != nums.length - 2) {
            return nums[nums.length - 1] >= prev;
        } else {
            return true;
        }
    }
}



class Solution {
    public int getMaximumGenerated(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        int[] nums = new int[n+1];
        nums[1] = 1;
        
        int max = 1;
        for(int index = 2; index <= n; index++) {
            if(index % 2 == 0) {
                int i = index / 2;
                nums[index] = nums[i];
            } else {
                int i  = (index - 1) / 2;
                nums[index] = nums[i] + nums[i+1];
            }
            max = Math.max(max, nums[index]);
        }
        
        return max;
    }
}

/* (0 - 18)

0
1
1
2
2
3
3
3
3
4
4
5
5
5
5
5
5
5
5 */


class Solution {
    public int findPairs(int[] nums, int k) {
        //3,1,4,1,5 -> 1,1,3,4,5
        Arrays.sort(nums);
        int ans = 0;
        
        for(int i=0; i<nums.length; i++){
            if(i != 0 && nums[i-1] == nums[i]){
                continue;
            }
            int num1 = nums[i];
            int j = i+1;
            while(j < nums.length){
                int diff = num1 - nums[j];
                if(diff == k || diff == -k){
                    ans++;
                    break;
                }
                j++;
            }
        }
        return ans;
    }
}
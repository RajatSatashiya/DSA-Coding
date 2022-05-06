class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        
        int n = 1;
        //0,1,2
        for(int i:nums){
            if(i <= 0) continue;
            if(i > n) {
                return n;
            }
            if(n == i) n++;
        }
        return n;
    }
}
class Solution {
    public int[] rearrangeArray(int[] nums) {
        //[3,1,-2,-5,2,-4]
        int[] ans = new int[nums.length];
        
        int pos = 0;
        int neg = 1;
        for(int i:nums){
            if(i > 0){
                ans[pos] = i;
                pos += 2;
            }else{
                ans[neg] = i;
                neg += 2;
            }
        }
        return ans;
    }
}
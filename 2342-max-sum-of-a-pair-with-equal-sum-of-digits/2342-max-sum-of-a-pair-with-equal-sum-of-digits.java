class Solution {
    public int maximumSum(int[] nums) {
        int ans = Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int res = sum(nums[i]);
            if(map.containsKey(res)) {
                ans = Math.max(ans, nums[i] + map.get(res));
                map.put(res, Math.max(nums[i], map.get(res)));
            } else {
                map.put(res, nums[i]);
            }
        }
        
        return (ans == Integer.MIN_VALUE) ? -1 : ans ;
    }
    
    //9, 7, 9, 4, 7
    public int sum(int n) {
        int temp = 0;
        
        while(n > 0) {
            temp += (n % 10);
            n /= 10;
        }
        
        return temp;
    }
}
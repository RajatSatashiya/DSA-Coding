class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        //[1,2] [-2,-1] -> -1 0 0 1
        //[-1,2] [0,2] -> [-1 1 2 4]
        
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        
        for(int i:nums1){
            for(int j:nums2){
                int sum = i + j;
                map.put(sum , map.getOrDefault(sum , 0) + 1);
            }
        }
        int ans = 0;
        
        for(int i:nums3){
            for(int j:nums4){
                ans += map.getOrDefault(-(i+j) , 0);
            }
        }
        return ans;

    }
}
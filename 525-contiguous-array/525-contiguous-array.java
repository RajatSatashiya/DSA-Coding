class Solution {
   public int findMaxLength(int[] nums) {
        // [0,0,1,0,0,0,1,1]
       // [-1, -1, 1, -1 , -1, -1 , 1 , 1]
       Map<Integer, Integer> map = new HashMap<>();
       for(int i=0; i<nums.length; i++){
           if(nums[i] == 0){
            nums[i] = -1;
           } 
       }
       int sum = 0, ans = 0;
       map.put(0,-1);
       for(int i=0; i<nums.length; i++){
           sum += nums[i];
           if(map.containsKey(sum)){
               int initial = map.get(sum);
               ans = Math.max(ans , i - initial);
           } else { 
               map.put(sum , i);
           }
       }
       
       return ans;
       
    }
}
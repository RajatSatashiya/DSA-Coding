class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, ans = 0;
        
        for(int i:nums){
            sum += i;
        }
        
        if(sum == k) ans++;
        
        //1,2,3,4,5
        int count = nums.length - 1;
        while(count > 0){
            sum = sum - nums[count];
            int tempSum = sum, start = 0, end = start + count - 1;
            while(end < nums.length){
                // if(start == 0){
                    if(tempSum == k){
                        ans++;
                    }
                    start++; end++;
                    if(end != nums.length){
                        tempSum += nums[end];
                        tempSum -= nums[start-1];
                        continue;
                    } else {
                        break;
                    }
                // } else{
                //     if(tempSum == k){
                //         ans++;
                //     }
                //     start++; end++;
                //     if(end != nums.length){
                //         tempSum += nums[end];
                //         tempSum -= nums[start-1];
                //         continue;
                //     } else {
                //         break;
                //     }
                // }
            }
            count--;
        }
        
        return ans;
    }
}
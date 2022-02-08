class Solution {
    public int[] sortEvenOdd(int[] nums) {
        // [4,1,2,3,6,8,7,9];
        int elast = 0, olast = 0;
        if(nums.length % 2 == 0){
            olast = nums.length - 1;
            elast = olast - 1;
        } else {
            olast = nums.length - 2;
            elast = nums.length - 1;
        }
        
        //even sort
        int i=2;
        while(i <= elast){
            int num = nums[i];
            int j = i-2;
            while(j >= 0 && nums[j] > num){
                nums[j+2] = nums[j];
                j -= 2;
            }
            i += 2;
            nums[j+2] = num;
        }
        
        //odd sort
        int k=3;
        while(k <= olast){
            int num = nums[k];
            int j = k-2;
            while(j >= 0 && nums[j] < num){
                nums[j+2] = nums[j];
                j -= 2;
            }
            k += 2;
            nums[j+2] = num;
        }
        
        return nums;
    }
}
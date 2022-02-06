class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        /* 
            Input: nums = [9,12,5,10,14,3,10], pivot = 10
            Output: [9,5,3,10,10,12,14]
        */
        
        int large = 0, small = 0, eq = 0;
        
        for(int i:nums){
            if(i > pivot) {
                large++;
            } else if (i < pivot){
                small++;
            } else {
                eq++;
            }
        }
        
        int[] nums2 = new int[nums.length];
        int s=0, l=small+eq, e=small;
        
        for(int i:nums){
            if(i > pivot) {
                nums2[l] = i;
                l++;
            } else if(i < pivot) {
                nums2[s] = i;
                s++;
            } else {
                nums2[e] = i;
                e++;
            }
        }
        return nums2;
    }
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i:nums){
            pq.add(i);
        }
        
        int ans = 0, index = nums.length - k;
        while(index >= 0) {
            ans = pq.poll();
            index--;
        }//[1,2,3,4,5,6] length - k
        
        //(4) 1 2 3 4
        return ans;
    }
}
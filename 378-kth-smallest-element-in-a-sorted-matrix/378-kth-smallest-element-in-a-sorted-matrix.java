class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int[] i:matrix) {
            for(int j:i) {
                pq.add(j);
            }
        }
        
        int ans = 0;
        while(k > 0) {
            ans = pq.peek();
            pq.poll();
            k--;
        }
        return ans;
    }
}
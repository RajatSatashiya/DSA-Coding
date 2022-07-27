class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int ans = 0, index = 0, n = events.length;
        for(int day = 1; day <= 100000; day++) {
            while(index < n && events[index][0] == day) {
                pq.add(events[index++][1]);
            }
            while(!pq.isEmpty() && pq.peek() < day) {
                int temp = pq.poll();
            }
            if(!pq.isEmpty()) {
                ans++;
                pq.poll();
            }
            
        }
        
        
        return ans;
    }
}
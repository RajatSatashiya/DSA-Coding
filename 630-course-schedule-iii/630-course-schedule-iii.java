class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a,b) -> a[1] - b[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int time = 0;
        for(int[] i:courses){
            if(time + i[0] <= i[1]) {
                pq.add(i[0]);
                time += i[0];
            } else if(!pq.isEmpty() && pq.peek() > i[0]){
                time += i[0] - pq.poll();
                pq.add(i[0]);
            }
        }
        return pq.size();
    }
}
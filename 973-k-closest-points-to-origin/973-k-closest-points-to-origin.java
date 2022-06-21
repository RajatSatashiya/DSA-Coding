class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < points.length; i++) {
            int dist = (int)Math.pow(points[i][0], 2) + (int)Math.pow(points[i][1], 2);
            if(map.containsKey(dist)) {
                map.get(dist).add(points[i]);
            } else {
                List<int[]> li = new ArrayList<>();
                li.add(points[i]);
                map.put(dist, li);
            }
            pq.add(dist);
        }
        int[][] ans = new int[k][2];
        while(k > 0) {
            System.out.println(pq.size());
            int index = ans.length - k;
            List<int[]> li = map.get(pq.poll());
            ans[index] = li.remove(0);
            k--;
        }
        
        return ans;
    }
}
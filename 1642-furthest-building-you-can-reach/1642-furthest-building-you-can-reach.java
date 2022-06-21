class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            
            if(diff > 0) {
                pq.add(diff);
            }
            if(pq.size() > ladders) {
                bricks -= pq.poll();
            }
            if(bricks < 0) {
                return i;
            }
        }
        return heights.length - 1;
    }
}


// 4 12 2 7 3 18 20 3 19
// 0 8  0 5 0 15 2  0 16  [16, 15, 8, 5]
// 0 0  0 0 0


//1 5 1 2 3 4 10000   (4br, 1ladder)
//0 4 0 1 1 1 10000


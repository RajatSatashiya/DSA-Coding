class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int sum = 0;
        for(int i:target) {
            sum += i;
            pq.add(i);
        }
        
        // while(pq.peek() != 1) {
        //     int val = pq.poll();
        //     int remSum = sum - val;
        //     val -= remSum;
        //     sum = remSum + val;
        //     if(val < 0) return false;
        //     pq.add(val);
        // }
        
        while(pq.peek() != 1) {
            int num = pq.poll();
            sum -= num;
            
            if(num <= sum || sum < 1) {
                return false;
            }
            num %= sum;
            sum += num;
            pq.add(num > 0 ? num : sum);
            
        }
        return true;
    }
}

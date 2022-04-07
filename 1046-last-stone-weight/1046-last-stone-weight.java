class Solution {
    public int lastStoneWeight(int[] stones) {
        //[1,1,2,4,1,x]
        Arrays.sort(stones);
        int idx = stones.length - 1;
        int element = 0;
        
        while(idx >= 1){
            element = stones[idx];
            stones[idx--] = Integer.MAX_VALUE;
            stones[idx] = element - stones[idx];
            Arrays.sort(stones);
        }
        return (stones[idx] > 0) ? stones[idx]: 0 ;
        
    }
}
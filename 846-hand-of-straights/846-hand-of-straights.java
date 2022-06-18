class Solution {
    public boolean isNStraightHand(int[] hand, int gs) {
        if(hand.length % gs != 0) return false;
        
        Arrays.sort(hand);
        boolean[] flag = new boolean[hand.length];
        int totalCount = 0;
        int index = 0;
        int preValue = 0;
        
        while(index < hand.length) {
            int valuesAdded = 0;
            index = 0;
            while(valuesAdded < gs && index < hand.length) {
                if(!flag[index] && (preValue + 1 == hand[index] || valuesAdded == 0)) {
                    flag[index] = true;
                    preValue = hand[index];
                    index++;
                    valuesAdded++;
                } else {
                    if(preValue + 1 < hand[index]) {
                        return false;
                    } else {
                        index++;
                        continue;
                    }
                }
            }
            // System.out.println(valuesAdded);
            totalCount += (valuesAdded == gs) ? 1 : 0;
        }
        
//         for(boolean b:flag){
//             System.out.print(b + " ");
//         }
        
        return totalCount == (hand.length / gs);
    }
}
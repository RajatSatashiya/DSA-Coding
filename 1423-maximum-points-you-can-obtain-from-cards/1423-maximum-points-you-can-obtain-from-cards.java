class Solution {
    public int maxScore(int[] card, int k) {
        int sublen = card.length - k;
        
        int totalSum = 0;
        for(int i:card) {
            totalSum += i;
        }
        
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0; i < sublen; i++) {
            sum += card[i];
        }
        ans = sum;
        
        for(int end = sublen; end < card.length; end++) {
            // System.out.println(sum);
            sum = sum - card[end - sublen] + card[end];
            ans = Math.min(ans, sum);
        }
        return totalSum - ans;
    }
}
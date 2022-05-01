class Solution {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        int start = 0, max_count = 0, max_len = 0;
        int[] cnt = new int[26];
        
        for(int end=0; end < len; end++) {
            max_count = Math.max(max_count, ++cnt[s.charAt(end) - 'A']);
            
            while(end - start + 1 - max_count > k) {
                cnt[s.charAt(start) - 'A']--;
                start++;
            }
            
            max_len = Math.max(max_len , end - start + 1);
        }
        
        return max_len;
    }
}
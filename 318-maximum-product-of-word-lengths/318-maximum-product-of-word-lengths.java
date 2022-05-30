class Solution {
    public int maxProduct(String[] words) {
        int len = words.length;
        int[] state = new int[len];
        
        for(int i=0; i<len; i++) {
            for(char ch:words[i].toCharArray()) {
                state[i] |= (1 << ch - 'a');
            }
        }
        int ans = 0;
        for(int i=0; i < len; i++) {
            for(int j=i+1; j < len; j++){ 
                if((state[i] & state[j]) == 0) {
                    ans = Math.max(ans, words[i].length() * words[j].length());
                }
            }
        }
            
        return ans;
    }
}
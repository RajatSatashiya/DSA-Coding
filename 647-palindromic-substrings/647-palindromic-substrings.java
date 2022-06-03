class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        
        for(int i = 0; i < s.length(); i++) {
            count += checkPalin(s, i, i); //odd lengths;
            count += checkPalin(s, i, i+1); //even lengths;
        }
        return count;
    }
    
    public int checkPalin(String s, int start, int end) {
        int count = 0;
        
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--; end++; count++;
        }
        return count;
    }
}
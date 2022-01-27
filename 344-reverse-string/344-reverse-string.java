class Solution {
    public void reverseString(char[] s) {
        int lo = 0;
        int hi = s.length - 1;
        
        while(lo < hi){
            char ch = s[lo];
            s[lo] = s[hi];
            s[hi] = ch;
            lo++;
            hi--;
        }
        // return s;
    }
}
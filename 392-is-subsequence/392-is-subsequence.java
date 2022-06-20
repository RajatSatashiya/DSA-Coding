class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) {
            return false;
        }
        if(s.length() == 0) {
            return true;
        }
        
        int sindex = 0, tindex = 0;
        
        while(tindex < t.length()) {
            char ch = s.charAt(sindex);
            
            if(ch == t.charAt(tindex)) {
                sindex++;
                if(sindex == s.length()) {
                    return true;
                }
                tindex++;
            } else {
                tindex++;
            }
        }

        return false;
    }
}
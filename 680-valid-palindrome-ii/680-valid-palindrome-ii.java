class Solution {
    public boolean validPalindrome(String s) {
        int len = s.length();
        if(len == 0) return true;
        
        int l = 0, r = len - 1;
        while(l < r && s.charAt(l) == s.charAt(r)){
            l++;
            r--;
        }
        
        if(l >= r) return true;
        
        // ctrtc
        if(isPalin(s, l+1, r ) || isPalin(s, l, r-1 )){
            return true;
        } else {
            return false;
        }
        
    }
    
    private boolean isPalin(String s, int low, int high){
        while(low <= high && s.charAt(low) == s.charAt(high)){
            low++;
            high--;
        }
        if(low >= high){
            return true;
        } else{
            return false;
        }
    }
}
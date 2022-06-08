class Solution {
    public int removePalindromeSub(String s) {
        if(check(s)) return 1;
        
        return 2;
    }
    
    public boolean check(String s) {
        int left = 0, right = s.length() - 1;
        
        while(left <= right && s.charAt(left) == s.charAt(right)) {
            left++;
            right--;
        }
        
        return (left > right);
    }
}
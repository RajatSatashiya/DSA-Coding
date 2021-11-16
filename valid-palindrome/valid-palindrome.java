class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        
        while(left <= right){
            char l = Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));
            int al = l;
            int rl = r;
            
            if((al < 97 || al > 122) && !Character.isDigit(al)){
                left++;
                continue;
            }
            if((rl < 97 || rl > 122) && !Character.isDigit(rl)){
                right--;
                continue;
            }
            if(l == r){
                left++;
                right--;
                continue;
            }else{
                return false;
            }
            
        }
        return true;
    }
}
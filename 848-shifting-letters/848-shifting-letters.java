class Solution {
    char[] ch = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m',
                           'n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    public String shiftingLetters(String s, int[] shifts) {
        for(int i = shifts.length - 2; i >= 0; i--) {
            shifts[i] += shifts[i + 1];
            shifts[i] %= 26;
        }
        StringBuilder str = new StringBuilder(s);
        
        for(int i = 0; i < s.length(); i++) {
            int index = (s.charAt(i) - 'a' + (shifts[i] % 26)) % 26;
            str.setCharAt(i, ch[index]);
        }
        
        return str.toString();
    }
}
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        
        //for s
        for(char ch:s.toCharArray()) {
            if(ch == '#') {
                if(!st.isEmpty()) {
                    st.pop();                    
                }
            } else {
                st.push(ch);
            }
        }
        
        int hash = 0;
        for(int i = t.length() - 1; i >= 0; i--) {
            if(t.charAt(i) == '#') {
                hash++;
                continue;
            }
            if(hash > 0) {
                hash--;
                continue;
            } else {
                if(!st.isEmpty() && st.pop() == t.charAt(i)) {
                    continue;
                } else {
                    return false;
                }
            }
            
        }
        return st.isEmpty();
    }
}
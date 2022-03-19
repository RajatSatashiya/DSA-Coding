class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int[] lastSeen = new int[26];
        boolean[] seen = new boolean[26];
        
        for(int i = 0; i < s.length(); i++){
            lastSeen[s.charAt(i) - 'a'] = i;
        }
               
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(seen[ch - 'a']) continue;
            while(!st.isEmpty() && st.peek() > ch && i < lastSeen[st.peek() - 'a']){
                seen[st.pop() - 'a'] = false;
            }
            st.push(ch);
            seen[ch - 'a'] = true;
            System.out.println(st);
        }
        
        String ans = "";
        while(!st.isEmpty()){
            ans = st.pop() + ans;
        }
        return ans;
    }
}
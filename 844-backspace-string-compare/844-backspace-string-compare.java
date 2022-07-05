class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        
        //for s
        for(char ch:s.toCharArray()) {
            // System.out.println("before: " + st1);
            if(ch == '#') {
                if(!st1.isEmpty()) {
                    st1.pop();                    
                }
            } else {
                st1.push(ch);
            }
            // System.out.println("after: " + st1);
        }
        //for t
        for(char ch:t.toCharArray()) {
            if(ch == '#') {
                if(!st2.isEmpty()) {
                    st2.pop();                    
                }
            } else {
                st2.push(ch);
            }
        }
        
        // System.out.println(st1);
        // System.out.println(st2);
        //final comparison
        if(st1.size() != st2.size()) return false;
        while(!st1.isEmpty()) {
            if(st1.pop() != st2.pop()) return false;
        }
        return true;
    }
}
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            if(s.charAt(i) == ')'){
                if(st.empty()) {
                    sb.setCharAt(i,'*');
                } else {
                    st.pop();
                }
            }
        }
        
        while(!st.empty()){
            sb.setCharAt(st.pop(),'*');
        }
        
        return sb.toString().replaceAll("\\*","");
    }
}
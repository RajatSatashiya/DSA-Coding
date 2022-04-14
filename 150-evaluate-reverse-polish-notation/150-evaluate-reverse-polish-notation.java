class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        
        for(String str:tokens){
            if(str.equals("+")){
                st.push(st.pop() + st.pop());
            } else if(str.equals("-")){
                st.push(-st.pop() + st.pop());
            } else if(str.equals("*")){
                st.push(st.pop() * st.pop());
            } else if(str.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b / a);
            } else {
                st.push(Integer.valueOf(str));
            }
        }
        return st.peek();
    }
}

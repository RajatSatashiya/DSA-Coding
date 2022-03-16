class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int i = 0, j = 0;
        st.push(pushed[i++]);
        
        while(i < pushed.length){
            if(st.isEmpty()){
                st.push(pushed[i++]);
            }
            if(st.peek() != popped[j]){
                st.push(pushed[i++]);
            } else {
                st.pop();
                j++;
            }
        }
        while(!st.isEmpty() && st.pop() == popped[j]) j++;
        return st.isEmpty();
    }
}
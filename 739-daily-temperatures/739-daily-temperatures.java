class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans = new int[temp.length];
        ans[ans.length - 1] = 0;
        Stack<Integer> st = new Stack<>();
        st.push(ans.length - 1);
        
        for(int i = ans.length - 2; i >= 0; i--) {
            while(!st.isEmpty() && temp[st.peek()] <= temp[i]) {
                st.pop(); 
            }
            ans[i] = (st.isEmpty()) ? 0 : st.peek() - i;
            st.push(i);
        }
        
        return ans;
    }
}
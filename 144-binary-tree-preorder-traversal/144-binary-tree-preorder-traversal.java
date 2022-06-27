class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()) {
            TreeNode temp = st.pop();
            if(temp != null) {
                li.add(temp.val);
                st.push(temp.right);
                st.push(temp.left);
            }
        }
        return li;
    }
}
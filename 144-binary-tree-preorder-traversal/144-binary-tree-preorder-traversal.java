class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        
        while(root != null) {
            li.add(root.val);
            
            if(root.right != null) {
                st.push(root.right);
            }
            root = root.left;
            
            if(root == null && !st.isEmpty()) {
                root = st.pop();
            }
        }
        return li;
    }
}
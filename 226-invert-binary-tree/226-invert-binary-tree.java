class Solution {
    public TreeNode invertTree(TreeNode root) {
        /*if(root == null) return null;
        
        TreeNode left = root.left, right = root.right;
        
        root.left = invertTree(right);
        root.right = invertTree(left);
        
        
        return root;*/
        
        
        //*** stack solution***//
            
        if(root == null) return null;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()){
            TreeNode temp = st.pop();
            TreeNode left = temp.left;
            temp.left = temp.right;
            temp.right= left;
            
            if(temp.left != null){
                st.push(temp.left);
            }
            if(temp.right != null){
                st.push(temp.right);
            }
        }
        
        return root;
    }
}
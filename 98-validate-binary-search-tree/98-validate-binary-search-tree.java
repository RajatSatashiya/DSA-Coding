class Solution {
    TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        
        //inorder traversal
        //left
        if(isValidBST(root.left) == false) return false;
        
        //do something in center
        if(prev != null && root.val <= prev.val) return false;
        prev = root;
        
        //right;
        if(isValidBST(root.right) == false) return false;
        
        return true;
    }
}
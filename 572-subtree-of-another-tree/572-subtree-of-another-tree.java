class Solution {
    public boolean isSubtree(TreeNode root, TreeNode sub) {
        if(root == null) return false;
        if(check(root, sub)) {
            return true;
        }
        return isSubtree(root.left, sub) || isSubtree(root.right, sub);
    }
    
    public boolean check(TreeNode root, TreeNode sub) {
        if(root == null && sub == null) return true;
        if(root == null || sub == null) return false;
        
        if(root.val != sub.val) return false;
        
        if(check(root.left, sub.left)) {
            if(check(root.right, sub.right)) {
                return true;
            }
        }
        return false;
    }
}
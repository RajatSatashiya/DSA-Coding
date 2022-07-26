class Solution {
    TreeNode ans;
    boolean flag = false;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        traverse(root, p, q);
        return ans;
    }
    
    public boolean traverse(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return false;
        
        boolean left = traverse(root.left, p, q);
        boolean right= traverse(root.right,p, q);
        
        boolean mid = (root == p || root == q) ? true : false;
        
        if((left && right) || (left && mid) || (right && mid)) {
            ans = root;
        }
        
        return left || right || mid;
    }
}
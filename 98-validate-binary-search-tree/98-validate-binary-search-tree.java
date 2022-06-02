class Solution {
    public boolean isValidBST(TreeNode root) {
        return recursion(root, null, null);
    }
    
    public boolean recursion(TreeNode root, Integer min, Integer max) {
        if(root == null) return true;
        if((min != null && root.val <= min) || (max != null && root.val >= max)) return false;
        
        return recursion(root.left, min, root.val) && recursion(root.right, root.val, max);
    }
}
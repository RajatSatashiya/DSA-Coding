class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        deepest(root);
        return max;
    }
    
    public int deepest(TreeNode root) {
        if(root == null) return 0;
        
        int left = deepest(root.left);
        int right = deepest(root.right);
        
        max = Math.max(max,left + right);
        
        return Math.max(left, right) + 1;
    }
}
class Solution {
    public int maxDepth(TreeNode root) {
        //base condition
        if(root == null){
            return 0;
        }
        
        //hypothesis
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        return Math.max(left, right) + 1;
    }
}
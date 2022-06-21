class Solution {
    int sum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return dfs(root, targetSum);
    }
    
    public boolean dfs(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null) {
            sum += root.val;
            if(targetSum == sum) {
                return true;
            }
            sum -= root.val;
            return false;
        }
        
        sum += root.val;
        if(dfs(root.left, targetSum)) {
            return true;
        }
        if(dfs(root.right, targetSum)){
            return true;
        }
        sum -= root.val;
        return false;
    }
}
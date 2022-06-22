class Solution {
    int sum = 0;
    int ans = 0;
    
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        traverse(root, targetSum);
        
        return ans;
    }
    public void traverse(TreeNode root, int targetSum) {
        if(root == null) return;
        
        dfs(root, targetSum);
        traverse(root.left, targetSum);
        traverse(root.right, targetSum);
    }
    
    public void dfs(TreeNode root, int targetSum) {
        if(root == null) {
            return;
        }
        // System.out.println(sum + " " + root.val);
        sum += root.val;
        if(sum == targetSum) {
            ans++;
            // sum -= root.val;
            // return;
        }
        
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
        sum -= root.val;
    }
}
class Solution {
    int ans = 0;
    public int goodNodes(TreeNode root) {
        traverse(root, root.val);
        return ans;
    }
    
    public void traverse(TreeNode root, int maxVal) {
        if(root == null) {
            return;
        }
        if(root.val >= maxVal) {
            ans++;
            maxVal = root.val;
        }
        traverse(root.left, maxVal);
        traverse(root.right, maxVal);
    }
}
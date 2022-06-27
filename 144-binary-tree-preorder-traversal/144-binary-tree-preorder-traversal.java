class Solution {
    List<Integer> arr = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return arr;
    }
    
    public void preorder(TreeNode root) {
        if(root == null) return;
        
        arr.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
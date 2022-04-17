class Solution {
    TreeNode head = null, prev = null;
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        
        increasingBST(root.left);
        if(head == null){
            head = root;
        }
        if(prev != null){
            root.left = null;
            prev.right = root;
        }
        prev = root;
        increasingBST(root.right);
        return head;        
    }
}
class Solution {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    // TreeNode prev = null;
//     
    public void recoverTree(TreeNode root) {
        traverse(root);
        
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    
    public void traverse(TreeNode root){
        if(root == null) return;
        
        traverse(root.left);
        //1,3,2,4
        if(first == null && root.val < prev.val){
                first = prev;                    
        }
        
        if(first != null && root.val < prev.val){
                second = root;
        }
        prev = root;
        traverse(root.right);
    }
}
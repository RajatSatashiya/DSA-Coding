class Solution {
    ArrayList<TreeNode> arr = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        
        return arr.get(k - 1).val;
    }
    
    public boolean inorder(TreeNode root, int k) {
        if(root == null) return false;
        
        if(inorder(root.left, k)) {
            return true;
        };
        
        arr.add(root);
        if(arr.size() == k) {
            return true;
        }
        
        if(inorder(root.right, k)) {
            return true;
        }
        
        return false;
    }
}
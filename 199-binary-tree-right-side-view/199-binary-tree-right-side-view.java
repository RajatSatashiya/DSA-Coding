class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        traverse(root, li, 0);
        
        return li;
    }
    
    public void traverse(TreeNode root, List<Integer> li, int depth) {
        if(root == null) {
            return;
        }
        
        if(depth == li.size()) {
            li.add(root.val);
        }
        
        traverse(root.right, li, depth + 1);
        traverse(root.left, li, depth + 1);
    }
}
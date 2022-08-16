class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        traverse(root, li, 0);
        
        return li;
    }
    
    public void traverse(TreeNode root, List<Integer> li, int level) {
        if(root == null) return;
        
        if(level == li.size()) {
            li.add(root.val);
        }
        
        traverse(root.right, li, level + 1);
        traverse(root.left, li, level + 1);
    }
}
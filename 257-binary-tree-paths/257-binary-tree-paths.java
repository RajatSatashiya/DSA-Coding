class Solution {
    List<String> li = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        String str = "";
        traverse(root, str);
        
        return li;
    }
    
    public void traverse(TreeNode root, String str) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            String a = "";
            if(str.length() != 0) {
                a += "->";
            }
            li.add(str + a + root.val);
            return;
        }
        String a = "";
        if(str.length() != 0) {
            a += "->";
        }
        traverse(root.left, str + a + root.val);
        traverse(root.right, str + a + root.val);
    }
}
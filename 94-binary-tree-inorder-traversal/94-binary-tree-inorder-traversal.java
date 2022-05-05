
class Solution {
    ArrayList<Integer> arr = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        
        inorderTraversal(root.left);
        arr.add(root.val);
        inorderTraversal(root.right);
        return arr;
    }
}
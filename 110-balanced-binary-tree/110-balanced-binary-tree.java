class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int one = depth(root.left);
        int two = depth(root.right);
        
        System.out.println("one: " + one + " two : " + two + " " + root.val);
        if(Math.abs(one - two) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        } else {
            return false;
        }
    }
    
    public int depth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}
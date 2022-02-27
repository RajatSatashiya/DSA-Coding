
class Solution {
    int max = 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    
    public int widthOfBinaryTree(TreeNode root) {
        maxwidth(root, 0, 0);
        return max;
    }
    
    public void  maxwidth(TreeNode root, int depth, int position) {
        if(root == null) return;
        
        map.computeIfAbsent(depth, x -> position);
        max = Math.max(max , position - map.get(depth) + 1);
        maxwidth(root.left, depth+1, position*2);
        maxwidth(root.right, depth+1, position*2 + 1);
    }
}
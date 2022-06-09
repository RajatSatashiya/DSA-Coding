class Solution {
    HashMap<Integer, Integer> inorderMap = new HashMap<>();
    int index;
    boolean rotate = false;
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = inorder.length - 1;
        
        for(int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        
        return binaryTree(postorder, 0, inorder.length - 1);
    }
    
    private TreeNode binaryTree(int[] postorder, int left, int right) {
        if(left > right) return null;
        
        int rootValue = postorder[index--];
        TreeNode root = new TreeNode(rootValue);
        
        root.right = binaryTree(postorder, inorderMap.get(rootValue) + 1, right);
        root.left = binaryTree(postorder, left, inorderMap.get(rootValue) - 1);
        
        return root;
    }
}
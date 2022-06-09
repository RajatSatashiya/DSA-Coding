class Solution {
    Map<Integer, Integer> inorderIndex = new HashMap<>();
    int index = 0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i < inorder.length; i++) {
            inorderIndex.put(inorder[i], i);
        }
        
        return binaryTree(preorder, 0, preorder.length - 1);
    }
    
    private TreeNode binaryTree(int[] preorder, int left, int right) {
        if(left > right) return null;
        
        int rootValue = preorder[index++];
        TreeNode root = new TreeNode(rootValue);
        
        root.left = binaryTree(preorder, left, inorderIndex.get(rootValue) - 1);
        root.right= binaryTree(preorder, inorderIndex.get(rootValue) + 1 , right);
        
        return root;
    }
}
class Solution {
    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return arr;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right,arr);
        
        return arr;
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = inorder(root, new ArrayList<Integer>());
        return arr.get(k-1);
    }
}
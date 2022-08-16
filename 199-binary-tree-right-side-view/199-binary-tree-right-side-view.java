class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        List<Integer> ans = new ArrayList<>();
        
        while(!q.isEmpty()) {
            int size = q.size();
            int val = 0;
            for(int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                val = temp.val;
                
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            ans.add(val);
        }
        
        return ans;
    }
}
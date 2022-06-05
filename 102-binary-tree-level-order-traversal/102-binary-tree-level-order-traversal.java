class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null) return ans;
        
        q.add(root); 
        
        //q -> 20 4 3
        //li -> [3], [9]
        while(!q.isEmpty()){
            List<Integer> li = new LinkedList<>();
            int size = q.size();
            
            for(int i=0; i<size; i++) {
                TreeNode temp = q.poll();
                li.add(temp.val);
                
                if(temp.left != null) {
                    q.add(temp.left);
                }
                if(temp.right != null) {
                    q.add(temp.right);
                }
            }
            ans.add(li);
        }
        return ans;
    }
}
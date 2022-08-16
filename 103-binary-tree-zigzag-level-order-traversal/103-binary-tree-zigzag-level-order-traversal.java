class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> li = new ArrayList<>();
        if(root == null) return li;
        
        Queue<TreeNode> q = new ArrayDeque<>();
        boolean flag = true;
        q.add(root);
        
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> arr = new ArrayList<>();
            
            for(int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                arr.add(temp.val);
                
                if(temp.left != null) {
                    q.add(temp.left);
                }
                if(temp.right != null) {
                    q.add(temp.right);
                }
            }
            
            if(!flag) {
                Collections.reverse(arr);
            }
            li.add(new ArrayList<>(arr));
            flag = !flag;
        }
        
        return li;
    }
}
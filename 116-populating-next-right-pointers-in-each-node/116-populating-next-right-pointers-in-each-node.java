class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            int size = q.size();
            Node prev = null;
            
            for(int i = 0; i < size; i++) {
                Node temp = q.poll();
                if(i == size - 1) {
                    temp.next = null;
                }
                if(prev != null) {
                    prev.next = temp;
                }
                prev = temp;
                if(temp.left != null) {
                    q.add(temp.left);
                }
                
                if(temp.right != null) {
                    q.add(temp.right);
                }
            }
        }
        return root;
    }
}
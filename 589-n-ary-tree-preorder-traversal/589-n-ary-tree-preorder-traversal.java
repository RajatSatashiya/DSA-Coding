class Solution {
    List<Integer> li = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        traverse(root);
        return li;
    }
    
    public void traverse(Node root) {
        if(root == null) {
            return;
        }
        
        li.add(root.val);
        for(Node ph: root.children) {
            traverse(ph);
        }
    }
}
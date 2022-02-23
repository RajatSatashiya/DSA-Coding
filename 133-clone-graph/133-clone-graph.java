class Solution {
    public HashMap<Integer, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        return clone(node);
    }
    
    public Node clone(Node node){
        if(node == null) return null;
        if(map.containsKey(node.val)){
            return map.get(node.val);
        }
        
        Node tempnode = new Node(node.val, new ArrayList<Node>());
        map.put(node.val, tempnode);
        
        for(Node nd: node.neighbors){
            tempnode.neighbors.add(clone(nd));
        }
        
        return tempnode;
    }
}
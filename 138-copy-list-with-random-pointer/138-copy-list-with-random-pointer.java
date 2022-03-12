class Solution {
    public Node copyRandomList(Node head) {
        Node dummy = new Node(0);
        Node current = dummy;
        Node iteration = head;

        HashMap<Node, Node> map = new HashMap<>();
        
        while(head != null){
            Node jade = new Node(0);
            jade.val = head.val;
            map.put(head, jade);
            current.next = jade;
            current = current.next;
            head = head.next;
        }
        Node another = dummy.next;
        while(iteration != null){
            another.random = map.get(iteration.random);
            iteration = iteration.next;
            another = another.next;
        }
        
        return dummy.next;
    }
}
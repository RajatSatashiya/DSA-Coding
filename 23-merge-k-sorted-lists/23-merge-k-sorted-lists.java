class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        
        PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(lists.length, (a,b) -> a.val - b.val);
        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        for(ListNode li:lists){
            if(li != null){
                q.add(li);
            }
        }
        
        while(!q.isEmpty()){
            tail.next = q.poll();
            tail = tail.next;
            
            if(tail.next != null) {
                q.add(tail.next);
            }
            //1 1 2
        }
        
        return dummy.next;
    }
}
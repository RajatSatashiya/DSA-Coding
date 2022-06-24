public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode root = head;
        
        while(root != null) {
            if(set.contains(root)) {
                return root;
            }
            set.add(root);
            root = root.next;
        }
        
        return null;
    }
}
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && fast.next != null){
            if(slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}

// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         ListNode walker = head;
//         ListNode runner = head;
//         while(runner!=null && runner.next!=null) {
//             walker = walker.next;
//             runner = runner.next.next;
//             if(walker==runner) return true;
//         }
//         return false;
//     }
// }
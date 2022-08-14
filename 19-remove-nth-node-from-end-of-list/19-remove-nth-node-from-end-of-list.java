class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        ListNode slow = temp, fast = temp;
        temp.next = head;
        
        while(n != 0) {
            fast = fast.next;
            n--;
        }
        
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        
        return temp.next;
    }
}
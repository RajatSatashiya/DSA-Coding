class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //1 2 3 4 5   ,  n = 2
        ListNode temp = head;
        int len = 0;
        
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        if(n == len) {
            return head.next;
        }
        len = len - n; // 5 - 2 = 3rd
        int val = 0;
        
        ListNode dummy = head;
        while(dummy != null) {
            if(val == len - 1) {
                if(dummy.next.next == null) {
                    dummy.next = null;
                } else {
                    dummy.next = dummy.next.next;
                }
                break;
            }
            dummy = dummy.next;
            val++;
        }
        return head;
    }
}
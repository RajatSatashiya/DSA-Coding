class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return null;
        
        ListNode prev = null, cur = head;
        while(left > 1) {
            prev = cur;
            cur = cur.next;
            left--;
            right--;
        }
        
        ListNode con = prev, tail = cur;
        while(right > 0) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            right--;
        }
        
        // System.out.println(prev.val);
        if(con != null) {
            con.next = prev;
        } else {
            head = prev;            
        }
        tail.next= cur;
        
        return head;
    }
}
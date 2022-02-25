class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left, right);
    }
    
    public ListNode merge(ListNode left, ListNode right) {
        ListNode ans = new ListNode();
        ListNode tail = ans;
        
        while(left != null && right != null) {
            if(left.val < right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }
        tail.next = (left == null) ? right : left;
        return ans.next;
    }
    
    public ListNode getMid(ListNode bomb) {
        ListNode slow = bomb, fast = bomb, temp = bomb;
        
        while (fast != null && fast.next != null) {
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        temp.next = null;
        return slow;
    }
}
class Solution {
    public ListNode partition(ListNode head, int x) {
        //nodes less than -> 1 2 2
        //nodes greather than-> 3 4 5
        ListNode less = new ListNode();
        ListNode great = new ListNode();
        
        ListNode temp = less;
        ListNode temp2= great;
        
        ListNode prev = null;
        ListNode prev2= null;
        
        while(head != null) {
            if(head.val < x) {
                temp.val = head.val;
                temp.next = new ListNode();
                temp = temp.next;
            } else {
                temp2.val = head.val;
                temp2.next = new ListNode();
                temp2 = temp2.next;
            }
            head = head.next;
        }
        
        ListNode ans = new ListNode();
        ListNode alsotemp = ans;
        
        while(less.next != null) {
            ListNode newtemp = new ListNode();
            newtemp.val = less.val;
            alsotemp.next = newtemp;
            alsotemp = alsotemp.next;
            less = less.next;
        }
        
        while(great.next != null) {
            ListNode newtemp = new ListNode();
            newtemp.val = great.val;
            alsotemp.next = newtemp;
            alsotemp = alsotemp.next;
            great = great.next;
        }
        
        return ans.next;
    }
}
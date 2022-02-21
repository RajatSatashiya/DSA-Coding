class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int val = len - n, cnt = 0;
        if(val == 0){
            return head.next;
        }
        ListNode dump = new ListNode(-1);
        dump.next = head;
        
        while(true){
            if(cnt == val - 1){
                head.next = head.next.next;
                break;
            }
            head = head.next;
            cnt++;
        }
        return dump.next;
    }
}
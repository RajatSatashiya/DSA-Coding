class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode demo = head;
        
        int sum = 0;
        while(demo != null && demo.next != null){
            if(demo.val == 0) {
                demo = demo.next;
                continue;
            }
            sum += demo.val;
            ListNode demo2 = demo.next;
            while(demo2.val != 0) {
                sum += demo2.val;
                demo2 = demo2.next;
            }
            if(demo2.next != null) {
                demo.next = demo2.next;
            } else {
                demo.next = null;
            }
            demo.val = sum;
            // demo.next = demo2;
            demo = demo.next;
            sum = 0;
        }
        
        return head.next;
    }
}
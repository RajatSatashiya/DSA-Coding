class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
        
        while(temp != null) {
            temp.val = temp.next.val;
            if(temp.next.next == null) {
                temp.next = null;
            }
            temp = temp.next;
        }
    }
}

//4 1 9 9
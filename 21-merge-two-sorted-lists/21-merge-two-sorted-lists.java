/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode current = ans;
        
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                current.next = l2;
                l2 = l2.next;
            }else{
                current.next = l1;
                l1 = l1.next;
            }
            current = current.next;
        }
        if(l1==null && l2==null) return ans.next;
        
        if(l1 == null){
            current.next = l2;
            // l2 = l2.next;
        }
        if(l2 == null){
            current.next = l1;
            // l1 = l1.next;
        }
        return ans.next;
    }
}
class Solution {
    ListNode initial;
    public boolean isPalindrome(ListNode head) {
        initial = head;
        
        return recursion(head);
    }
    
    public boolean recursion(ListNode root) {
        if(root == null) return true;
        boolean ans = recursion(root.next);
        boolean flag = (root.val == initial.val) ? true : false;
        initial = initial.next;
        
        return ans && flag;
    }
}
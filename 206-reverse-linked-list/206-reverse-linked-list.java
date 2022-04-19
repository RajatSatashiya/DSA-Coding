class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        
        while(head != null){
            st.push(head);
            head = head.next;
        }
        ListNode ans = new ListNode(0);
        ListNode demo = ans;
        while(!st.isEmpty()){
            ListNode temp = st.pop();
            // if(temp.next != null){
            //     System.out.println(temp.val + " " + temp.next.val);
            // }
            temp.next = null;
            demo.next = temp;
            demo = demo.next;
                
        }
        return ans.next;
    }
}
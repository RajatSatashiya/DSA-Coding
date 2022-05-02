class Solution {
    public void reorderList(ListNode head) {
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode temp = head;
        
        while(temp != null){
            arr.add(temp);
            temp = temp.next;
        }
        int l = 1, r = arr.size()-1;
        
        ListNode demo = head;
        boolean flag = true;
        while(l <= r){
            if(flag){
                ListNode temp2 = arr.get(r--);
                temp2.next = null;
                demo.next = temp2;
            } else {
                ListNode temp2 = arr.get(l++);
                temp2.next = null;
                demo.next = temp2;
            }
            flag = !flag;
            demo = demo.next;
        }
    }
}
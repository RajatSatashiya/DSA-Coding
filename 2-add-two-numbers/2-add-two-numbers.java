class Solution {
    // public void anotherNull(ListNode l1, int carry, ListNode sole){
    //     while(l1 != null){
    //         int sum = l1.val + carry;
    //         carry = sum / 10;
    //         if(sum > 9){
    //             ListNode temp = new ListNode();
    //             temp.val = sum % 10;
    //             sole.next = temp;
    //         }else{
    //             ListNode temp = new ListNode();
    //             temp.val = sum;
    //             sole.next = temp;
    //         }
    //         sole = sole.next;
    //         l1 = l1.next;
    //     }
    // }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode sole = ans;
        
        int carry = 0;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            
            if(sum > 9){
                ListNode temp = new ListNode();
                temp.val = sum % 10;
                sole.next = temp;
            }else{
                ListNode temp = new ListNode();
                temp.val = sum;
                sole.next = temp;
            }
            sole = sole.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        if(l2 == null && l1 != null){
            while(l1 != null){
                int sum = l1.val + carry;
                    carry = sum / 10;
                if(sum > 9){
                    ListNode temp = new ListNode();
                    temp.val = sum % 10;
                    sole.next = temp;
                }else{
                    ListNode temp = new ListNode();
                    temp.val = sum;
                    sole.next = temp;
                }
                sole = sole.next;
                l1 = l1.next;
                }
        }
        if(l1 == null && l2 != null){
            while(l2 != null){
                int sum = l2.val + carry;
                carry = sum / 10;
                if(sum > 9){
                    ListNode temp = new ListNode();
                    temp.val = sum % 10;
                    sole.next = temp;
                }else{
                    ListNode temp = new ListNode();
                    temp.val = sum;
                    sole.next = temp;
                }
                sole = sole.next;
                l2 = l2.next;
            }
        }
        
        if(carry != 0){
            ListNode temp = new ListNode();
            temp.val = carry;
            sole.next = temp;
        }
        return ans.next;
    }
}
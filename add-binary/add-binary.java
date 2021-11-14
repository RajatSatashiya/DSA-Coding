class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int a1 = a.length() - 1;
        int b1 = b.length() - 1;
        int carry = 0;
        
        while(a1 >= 0 || b1 >= 0) {
        	int sum = carry;
        	if(a1 >= 0) {
        		sum += (a.charAt(a1--)- '0');
        	}
        	if(b1 >= 0) {
        		sum += (b.charAt(b1--)- '0');
        	}
        	sb.append(sum % 2);
        	carry = sum / 2;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
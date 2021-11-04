class Solution {
    public static int[] plusOne(int[] digits) {
		int toAdd = 1;
		int idx = digits.length - 1;
		
		while(toAdd == 1) {
			if(idx < 0) {
				int[] s = new int[digits.length+1];
				s[0] = 1;
				for(int i=1; i<s.length-1; i++) {
					s[i] = digits[i-1];
				}
				digits = s;
				break;
			}
			if(digits[idx] == 9) {
				digits[idx] = 0;
			}else {
				digits[idx] += 1;
				toAdd = 0;
			}
			idx--;
		}
//		int[] s = new int[] {};
		return digits;
    }
}
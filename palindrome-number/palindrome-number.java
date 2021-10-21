class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
		int l = 0;
		int r = str.length()-1;
		
		Boolean flag = true;
		while(l < r) {
			char left = str.charAt(l);
			char right = str.charAt(r);
			
			if(left != right) {
				flag = false;
				return flag;
			}
			l++;
			r--;
		}
		return flag;   
    }
}
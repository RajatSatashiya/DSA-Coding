class Solution {
    public static int lengthOfLastWord(String s) {
		Boolean flag = true;
		int len = 0;
		for(int i=s.length()-1; i>=0; i--) {
			char cur = s.charAt(i);
			if(cur == ' ') {
				if(flag) {
					continue;
				}else {
					break;
				}
			}else {
				len++;
				flag = false;
			}
		}
		return len;
	}
}
class Solution {
   public static int strStr(String haystack, String needle) {
		int len = needle.length();
		
		for(int i=0; i<=haystack.length()-len; i++) {
			String sub = haystack.substring(i,i+len);
//			System.out.println("")
			if(sub.equals(needle)) {
				return i;
			}
		}
		return -1;
    }
}
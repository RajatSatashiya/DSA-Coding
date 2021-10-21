class Solution {
    public static String longestCommonPrefix(String[] strs) {
		String str="";
		String use = strs[0];
		
		for(int i=1; i<=use.length(); i++) {
            String sub = use.substring(0,i);
            boolean flag = true;
            for(int j=1; j<strs.length; j++) {
            	if(strs[j].length() < sub.length()) {
            		return str;
            	}
            	if(!sub.equals(strs[j].substring(0,i))){
//            		System.out.println("" + sub);
            		flag = false;
            		break;
            	};
            }
            str = (flag) ? sub : str;
		}
		return str;
	}
}
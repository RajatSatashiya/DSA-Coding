class Solution {
    public String convert(String s, int numRows) {
		String ans = "";
		String[] str = new String[numRows];
        
        if(s.length() < numRows){
            return s;
        }
        if(numRows == 1) return s;
		
		int index = 0;
		boolean flag = true;
		
		char[] strChar = s.toCharArray();
		for(char ch:strChar) {
			if(str[index] == null) {
				str[index] = "";
			}
			str[index] += ch;
			index += (flag ? 1:-1);
			if(index == 0 || index == numRows-1) {
				flag = !flag;
			}
		}
		for(String i:str) {
			ans += i;
		}
		return ans;
	}
}
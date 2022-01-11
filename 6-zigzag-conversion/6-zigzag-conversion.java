class Solution {
    public String convert(String s, int numRows) {
		String ans = "";
		String[] str = new String[numRows];
        
        if(s.length() < numRows){
            return s;
        }
        if(numRows == 1){
            return s;
        }
		
		int index = 0;
		boolean flag = true;
		for(int i=0; i<s.length(); i++) {
			str[index] += s.charAt(i);
			
			int diff = numRows - index - 1;
			if(diff == numRows-1) {
				flag = true;
			}else if(diff == 0) {
				flag = false;
			}
			
			if(flag) {
				index++;
			}else {
				index--;
			}
		}
		
		for(String i:str) {
			ans += i.substring(4,i.length());
		}
		return ans;
	}
}
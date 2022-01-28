class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            List<String> ans = new LinkedList<String>();
            return ans;
        }
		LinkedList<String> ans = new LinkedList<String>();
        String[] mapping = new String[]{"0","0","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        ans.add("");
        for(int i=0; i<digits.length(); i++){
            int num = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length() == i){
                String first = ans.remove();
                for(char j:mapping[num].toCharArray()){
                    ans.add(first + j);
                }
            }
        }
        return ans;
	}
}
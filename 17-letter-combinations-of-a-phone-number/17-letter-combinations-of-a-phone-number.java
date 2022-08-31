class Solution {
    List<String> li = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) {
            return new ArrayList<>();
        }
        String[] vals = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        backtrack(digits, vals, 0, "");
        return li;
    }
    
    public void backtrack(String digits, String[] vals, int index, String ans) {
        if(ans.length() == digits.length()){
            li.add(ans);
            return;
        }
        
        //234 -> ad (g, h, i)
        int num = digits.charAt(index) - '0';
        for(int i = 0; i < vals[num].length(); i++) {
            backtrack(digits, vals, index + 1, ans + vals[num].charAt(i));
        }
    }
}
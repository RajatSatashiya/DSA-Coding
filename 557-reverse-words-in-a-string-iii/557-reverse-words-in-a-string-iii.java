class Solution {
    public String reverseWords(String s) {
        int i = 0, j = 0;
        StringBuilder ans = new StringBuilder();
        
        while(j < s.length()){
            if(s.charAt(j) == ' '){
                addStr(s.substring(i,j), ans);
                ans.append(" ");
                // System.out.println(ans);
                i = j + 1;
                j = i;
            } else {
                j++;
            }
        }
        addStr(s.substring(i,j), ans);
        return ans.toString();
    }
    
    public void addStr(String str, StringBuilder ans){
        for(int i=str.length()-1; i >= 0; i--){
            ans.append(str.charAt(i));
        }
        
    }
}
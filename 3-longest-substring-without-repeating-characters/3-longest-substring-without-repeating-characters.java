class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 1;
        
        if(s.length() == 0) return 0;
        
        for(int i=0; i<s.length(); i++){
            String str = "";
            str += s.charAt(i);
            
            for(int j=i+1; j<s.length(); j++){
            	String ch = Character.toString(s.charAt(j));
                if(str.contains(ch)){
                    break;
                }else{
                    str += ch;
                }
            }
            if(str.length() > max){
                max = str.length();
            }
        }
        
        return max;
    }
}
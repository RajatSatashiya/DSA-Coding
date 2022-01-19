class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();
        
        if(s.length() != t.length()){
            return false;
        }
        
        boolean flag = true;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            char val = t.charAt(i);
            
            if(!hm.containsKey(ch)){
                if(hm.containsValue(val)){
                    return false;
                }
                hm.put(ch,t.charAt(i));
            }else{
                if(hm.get(ch) == t.charAt(i)){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return flag;
    }
}
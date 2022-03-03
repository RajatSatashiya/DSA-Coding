class Solution {
    HashMap<Character, Integer> map;
    public boolean isAlienSorted(String[] words, String order) {
        map = new HashMap<>();
        int c = 0;
        for(char ch:order.toCharArray()){
            map.put(ch,c++);
        }
        c = 0;
        while(c < words.length - 1) {
            boolean flag = compare(words[c], words[c+1]);
            c++;
            if(!flag) return false;
        }
        
        return true;
    }
    
    public boolean compare(String str, String str2){
        int min = Math.min(str.length(), str2.length());
        int val = 0;
        
        for(int i = 0; i < min; i++, val++){
            if(str.charAt(i) != str2.charAt(i)){
                if(map.get(str.charAt(i)) > map.get(str2.charAt(i))){
                    return false;
                } else {
                    return true;
                }
            }
        }
        if(min == str.length()){
            return true;
        } else {
            return false;
        }
    }
}
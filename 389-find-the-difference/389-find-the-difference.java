class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0){
            return t.charAt(0);
        }
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
                if(map.get(t.charAt(i)) < map2.get(t.charAt(i))){
                    return t.charAt(i);
                }
            } else {
                return t.charAt(i);
            }
        }
        
        return 'x';
    }
}
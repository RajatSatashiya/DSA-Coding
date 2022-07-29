class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> li = new ArrayList<>();
        for(String str:words) {
            if(check(str, pattern)) {
                li.add(str);
            }
        }
        return li;
    }
    
    public boolean check(String str, String pattern) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        
        for(int i = 0; i < str.length(); i++) {
            if(!map.containsKey(pattern.charAt(i))) {
                if(set.contains(str.charAt(i))) {
                    return false;
                }
                map.put(pattern.charAt(i), str.charAt(i));
                set.add(str.charAt(i));
            } else {
                if(map.get(pattern.charAt(i)) != str.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
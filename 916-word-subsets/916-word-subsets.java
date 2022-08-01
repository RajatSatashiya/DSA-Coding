class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        Map[] arr = new HashMap[words2.length];
        List<String> li = new ArrayList<>();
        
        //create map for elements of words2
        String bigstr = createword(words2);
        Map<Character, Integer> bigmap = createMap(bigstr);
        
        //loop through words1 strings
        for(int i = 0; i < words1.length; i++) {
            Map<Character, Integer> map = createMap(words1[i]);
            
            if(compare(map, bigmap)) {
                li.add(words1[i]);
            }
        }
        return li;
    }
    
    public Map<Character, Integer> createMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
    
    public String createword(String[] words) {
        int[] arr = new int[26];
        
        for(String str: words) {
            int[] temp = new int[26];
            for(char ch:str.toCharArray()) {
                temp[ch - 'a']++;
                arr[ch - 'a'] = Math.max(arr[ch - 'a'] , temp[ch - 'a']);
            }
        }
        
        String str = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                String tempstr = "";
                tempstr += (char)(i + 97);
                str += tempstr.repeat(arr[i]);
            }
        }
        return str;
    }
    
    public boolean compare(Map<Character, Integer> str, Map<Character, Integer> str2) {
        for(Character ch:str2.keySet()) {
            if(!str.containsKey(ch)){
                return false;
            } else {
                if(str.get(ch) < str2.get(ch)){
                    return false;
                }
            }
        }
        return true;
    }
}
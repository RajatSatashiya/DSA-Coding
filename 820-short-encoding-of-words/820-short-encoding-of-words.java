class Solution {
    public int minimumLengthEncoding(String[] words) {
        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        
        for(int i = 0; i < words.length; i++) {
            for(int j = 1; j < words[i].length(); j++) {
                String str = words[i].substring(words[i].length() - j);
                set.remove(str);
            }
        }
        
        //time bell
        
        int ans = 0;
        for(String str:set) {
            ans += str.length();
        }
        return ans + set.size();
    }
}
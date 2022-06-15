class Solution {
    public int longestStrChain(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.sort(words, (a,b) -> a.length() - b.length());
        
        int ans = 0;
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() == 1) {
                map.put(words[i], 1);
                ans = Math.max(ans, 1);
                continue;
            }
            int temp = 0;
            for(int j = 0; j < words[i].length(); j++) {
                String prev = words[i].substring(0, j) + words[i].substring(j + 1, words[i].length());
                temp = Math.max(temp, map.getOrDefault(prev, 0) + 1);
            }
            map.put(words[i], temp);
            ans = Math.max(temp, ans);
        }
        // System.out.println(map);
        return ans;
    }
}

/* 

a -> 1 1 2 3 3
a b ba bca bda-> 

*/
class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(char ch:s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        boolean flag = false;
        int ans = 0;
        
        for(int i:map.values()){
            if(i % 2 == 0){
                ans += i;
            } else {
                if(!flag) {
                    ans += i;
                    flag = true;
                } else {
                    ans += (i - 1);
                }
            }
        }
        return ans;
    }
}



class Solution {
    public boolean hasAllCodes(String s, int k) {
        int total = (int)Math.pow(2, k);
        
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i <= s.length() - k; i++) {
            String str = s.substring(i, i + k);
            if(!set.contains(str)) {
                set.add(str);
            }
        }
        
        return total == set.size();
    }
}
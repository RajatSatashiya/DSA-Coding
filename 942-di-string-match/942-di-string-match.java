class Solution {
    public int[] diStringMatch(String s) {
        int[] temp = new int[s.length() + 1];
        
        int lo = 0, hi = s.length();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I') {
                set.add(lo);
                temp[i] = lo;
                lo++;
            } else {
                set.add(hi);
                temp[i] = hi;
                hi--;
            }
        }
        
        for(int i = 0; i <= s.length(); i++) {
            if(!set.contains(i)) {
                temp[temp.length - 1] = i;
            }
        }
        
        return temp;
    }
}

/*
D -> lo
I -> hi

0
lo = 0
hi = 4

*/
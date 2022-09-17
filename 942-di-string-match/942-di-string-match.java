class Solution {
    public int[] diStringMatch(String s) {
        int[] temp = new int[s.length() + 1];
        
        int lo = 0, hi = s.length();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I') {
                temp[i] = lo++;
            } else {
                temp[i] = hi--;
            }
        }
        
        temp[s.length()] = lo;
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
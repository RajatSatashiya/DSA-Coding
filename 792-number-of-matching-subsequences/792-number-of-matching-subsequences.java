class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        List<Integer>[] pos = new List['z'-'a'+1];
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(pos[ch - 'a'] == null) {
                pos[ch - 'a'] = new ArrayList<>();
            }
            pos[ch - 'a'].add(i);
        }
        
        //[a,b,c,d,e] -> [[1], [2], [3], [4], [5]];
        int ans = 0;
        
        for(String str:words) {
            int cur = 0;
            for(int i = 0; i < str.length(); i++, cur++) {
                char ch =  str.charAt(i);
                cur = search(pos[ch - 'a'], cur);
                if(cur == -1) break;
            }
            if(cur != -1) {
                ans++;
            }
        }
        return ans;        
    }
    
    public int search(List<Integer> pos, int cur) {
        if(pos == null) return -1;
        int lo = 0, hi = pos.size() - 1;
        
        if(pos.get(lo) > cur) return pos.get(lo);
        if(pos.get(hi) < cur) return -1;
        
        while(lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if(pos.get(mid) == cur) {
                System.out.println("yes");
                return pos.get(mid);
            }
            if(pos.get(mid) < cur) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return pos.get(hi);
    }
    
}
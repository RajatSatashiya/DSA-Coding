class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 1;
        int slen = s.length();
        
        if(s.length() == 0) return 0;
        for(int i=0; i<slen; i++) {
        	if(slen - i <= max) return max;
        	
        	HashMap<Character,Integer> hm = new HashMap<>();
        	hm.put(s.charAt(i),1);
        	
        	for(int j=i+1; j<slen; j++) {
        		if(hm.containsKey(s.charAt(j))) {
        			break;
        		}else {
        			hm.put(s.charAt(j),1);
        		}
        	}
        	if(hm.size() > max) {	
        		max = hm.size();
        	}
        }
        
        return max;
    }
}
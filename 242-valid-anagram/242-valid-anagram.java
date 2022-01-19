class Solution {
    public  boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(char i:s.toCharArray()) {
        	if(hm.containsKey(i)) {
        		hm.put(i, hm.get(i)+1);
        	}else {
        		hm.put(i, 1);
        	}
        } 
        for(char j:t.toCharArray()) {
        	if(hm.containsKey(j)) {
        		if(hm.get(j) > 0) {
        			hm.put(j,hm.get(j)-1);
        		}else {
        			return false;
        		}
        	}else {
        		return false;
        	}
        }
        boolean flag = true;
        for(int k:hm.values()) {
        	if(k > 0) {
        		flag = !flag;
        		break;
        	}
        }
        return flag;
    }
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }      
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(char ch:s2.toCharArray()){
            map.put(ch, 0);
            map2.put(ch,0);
        }     
        for(char ch:s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
            
        for(int i=0; i<s1.length(); i++){
            char ch = s2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        if(map.equals(map2)) return true;
        int lo = 0, hi = lo + s1.length() - 1;
        
        while(hi < s2.length() - 1){       
            char rem = s2.charAt(lo);
            map2.put(rem, map2.get(rem) - 1);
            lo++;
            hi++;
            char add =s2.charAt(hi);
            map2.put(add, map2.getOrDefault(add, 0) + 1);
            if(map.equals(map2)) return true;
        }
        // System.out.println(map2);
        return false;
    }
}
class Solution {
    public String greatestLetter(String s) {
        //a-z -> 97-122
        //A-Z -> 65-90
        
        HashSet<Integer> set = new HashSet<>();
        
        for(char ch:s.toCharArray()) {
            int ascii = ch;
            set.add(ascii);
        }
        
        for(int i = 90; i >= 65; i--) {
            if(set.contains(i)){
                if(set.contains(i+32)){
                    return Character.toString((char)i);
                }
            }
        }
        return "";
    }
}
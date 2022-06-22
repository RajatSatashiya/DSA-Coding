class Solution {
    public String greatestLetter(String s) {
        //a-z -> 97-122
        //A-Z -> 65-90
        
        HashSet<Integer> set = new HashSet<>();
        
        for(char ch:s.toCharArray()) {
            int ascii = ch;
            set.add(ascii);
        }
        
        int ans = -1;
        for(char ch:s.toCharArray()){
            int ascii = ch;
            if(ascii >= 97) {
                if(set.contains(ascii - 32)) {
                   ans = Math.max(ans, ascii - 32);
                }
            } else {
                if(set.contains(ascii + 32)) {
                   ans = Math.max(ans, ascii);
                }
            }
        }
        char temp = (char)ans;
        return (ans == -1) ? "" : Character.toString(temp);
        
    }
}
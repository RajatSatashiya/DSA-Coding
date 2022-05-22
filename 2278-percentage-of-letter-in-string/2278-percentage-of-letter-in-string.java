class Solution {
    public int percentageLetter(String s, char letter) {
        int i=0;
        int ans = 0;
        while(i < s.length()){
            if(s.charAt(i) == letter) {
                ans++;
            }
            i++;
        }
        
        return (ans * 100 ) / s.length();
    }
}
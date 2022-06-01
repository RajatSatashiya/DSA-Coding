class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if((n&1) == 1) return false;
        
        //left to right
        int bal = 0;
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == '(' || locked.charAt(i) == '0') {
                bal++;
            } else {
                bal--;
            }
            if(bal < 0) return false;
        }
        
        //right to left
        bal = 0;
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) == ')' || locked.charAt(i) == '0') {
                bal++;
            } else {
                bal--;
            }
            
            if(bal < 0) return false;
        }
        
        return true;
    }
}
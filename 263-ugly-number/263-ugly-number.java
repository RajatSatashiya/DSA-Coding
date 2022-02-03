class Solution {
    public boolean isUgly(int n) {
        if(n == 0) return false;
        int[] fac = new int[]{2,3,5};
        int pos = 0;
        
        while(n != 1 && pos < 3){
            if(n % fac[pos] == 0){
                n = n / fac[pos];
            } else {
                pos++;
            }
        }
        
        return n == 1;
    }
}
class Solution {
    public boolean isUgly(int n) {
        // int[] arr = new int[]{2, 3, 5};
        if(n == 0) return false;
        
        while(n != 1) {
            if(n % 2 == 0) {
                n = n / 2;   
            } else if (n % 3 == 0) {
                n = n / 3;
            } else if (n % 5 == 0) {
                n = n / 5;
            } else {
                return false;
            }
        }
        
        return true;
    }
}
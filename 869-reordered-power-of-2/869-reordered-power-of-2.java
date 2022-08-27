class Solution {
    public boolean reorderedPowerOf2(int n) {
        //61
        int[] countarr = count(n);
        int num = 1;
        
        for(int i = 0; i < 31; i++) {
            int[] temp = count(num);
            
            if(Arrays.equals(countarr, temp)) {
                return true;
            }
            
            num = num << 1;
        }
        
        return false;
    }
    
    public int[] count(int n) {
        int[] arr = new int[10];
        
        while(n != 0) {
            arr[n % 10]++;
            n /= 10;
        }
        return arr;
    }
}
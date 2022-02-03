class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hset = new HashSet<Integer>();
        int sum = 0;
       
        //234
        while(n != 1){
            sum = 0;
            while(n != 0){
                int temp = n % 10;
                sum += temp * temp;
                n = n / 10;
            }
            n = sum;
            if(!hset.add(n)){
                return false;
            }
        }
        
        return true;
    }
}
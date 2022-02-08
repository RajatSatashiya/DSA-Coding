class Solution {
    public int addDigits(int num) {
        int ans = 0;
        while(true){
            int rem = num % 10;
            int temp = num / 10;
            // System.out.println(rem + " " + temp);
            ans = rem + temp;
            num = ans;
            
            if(ans < 10){
                break;
            }
        }
        return ans;
    }
}
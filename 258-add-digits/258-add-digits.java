class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;
        int ans = ((num / 10) + (num % 10)) % 9;
        
        /*
        0 - 0
        10 - 1
        20 - 2
        30 - 3
        40 - 4
        ...
        80 - 8
        90 - 9
        100 - 1
        110 - 2
        160 - 7
        
        165: 16 + 5 = 21 % 9 = 3
        */
        
        if(ans == 0) ans = 9;
        return ans;
    }
}
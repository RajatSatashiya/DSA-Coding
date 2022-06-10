class Solution {
    public int getSum(int a, int b) {
        while(b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}

//2 -> 0010
//3 -> 0011

//b -> 0100
//a -> 0001

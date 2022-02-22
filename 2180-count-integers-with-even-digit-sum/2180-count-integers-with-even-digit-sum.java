class Solution {
    public int countEven(int num) {
        //0-9  -> 4
        //10-19 -> 5
        //20-29 -> 5
        //37 -> 0 - 29: 14, 
        int val = num - (num % 10);
        int sum = 4 + (val - 10) / 2; 
        boolean flag = true;
        int val2 = val / 10;
        int sum2 = 0;
        
        while(val2 != 0){
            sum2 += val2 % 10;
            val2 = val2 / 10;
        }
        if(sum2 % 2 != 0){
            flag = false;
        }
        for(int i=val; i<=num; i++){
            if(!flag){
                flag = true;
            } else {
                sum++;
                flag = false;
            }
        }
        
        return sum;
        
    }
}
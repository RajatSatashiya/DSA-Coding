class Solution {
    int steps = 0;
    public int numberOfSteps(int num) {
        answer(num);
        return steps;
    }
    
    public void answer(int num) {
        if(num == 0) return;
        steps++;
        
        if(num % 2 == 0) {
            numberOfSteps(num / 2);
        } else {
            numberOfSteps(num - 1);
        }
    }
}
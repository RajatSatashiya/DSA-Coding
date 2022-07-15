class Solution {
    public int[] dailyTemperatures(int[] temp) {
        if(temp.length == 1) return new int[1];
        int[] ans = new int[temp.length];
        
        for(int i = 0; i < temp.length; i++) {
            int num = temp[i];
            for(int j = i + 1; j < temp.length; j++) {
                if(temp[j] > num) {
                    ans[i] = j - i;
                    break;
                }
            }
        }
        
        return ans;
    }
}
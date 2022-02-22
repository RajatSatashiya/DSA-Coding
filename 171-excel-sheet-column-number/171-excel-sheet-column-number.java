class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle.length() == 1){
            return columnTitle.charAt(0) - 'A' + 1;
        }
        int ans = 0;
        
        for(int i=columnTitle.length()-1; i>=0; i--){
            int num = columnTitle.charAt(i) - 'A' + 1;
            int power = columnTitle.length() - i - 1;
            
            ans += num * Math.pow(26,power);
        }
        return ans;
    }
}
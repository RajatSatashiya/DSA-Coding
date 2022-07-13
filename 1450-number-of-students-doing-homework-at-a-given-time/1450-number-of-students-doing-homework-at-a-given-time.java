class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int qt) {
        int ans = 0;
        
        for(int i = 0; i < startTime.length; i++) {
            if(qt >= startTime[i] && qt <= endTime[i]) {
                ans++;
            }
        }
        return ans;
    }
}
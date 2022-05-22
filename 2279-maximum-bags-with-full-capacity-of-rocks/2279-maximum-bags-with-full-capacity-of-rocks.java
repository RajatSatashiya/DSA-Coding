class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int ar) {
        //[10,3,4,5]
        //[1,2,4,4]
        
        //9, 1, 0, 1
        //0,1,1,9
        
        int[] diff = new int[rocks.length];
        for(int i=0; i<rocks.length; i++) {
            diff[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(diff);
        int ans = 0;
        
        for(int i:diff){
            if(i==0){
                ans++;
                continue;
            }
            if(i > ar) {
                break;
            }
            ans++;
            ar = ar - i;
        }
        return ans;
    }
}
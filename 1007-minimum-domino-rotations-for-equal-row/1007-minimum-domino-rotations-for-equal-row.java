class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int topCount = 0, bottomCount = 0;
        int ans = 0, i = 0;
        
        //do for top[0] common number
        while(i < tops.length){
            if(tops[i] == tops[0] && bottoms[i] != tops[0]){
                topCount++;
            } else if (tops[i] != tops[0] && bottoms[i] == tops[0]) {
                bottomCount++;
            } else if (tops[i] == tops[0] && bottoms[i] == tops[0]) {
                i++;
                continue;
            } else {
                break;
            }
            i++;
        }
        
        if(i == tops.length){
            return Math.min(topCount, bottomCount);
        }
        
        //do for bottom[0] common number
        topCount = 0;
        bottomCount = 0;
        i = 0;
        while(i < tops.length){
            if(tops[i] == bottoms[0] && bottoms[i] != bottoms[0]){
                topCount++;
            } else if (tops[i] != bottoms[0] && bottoms[i] == bottoms[0]) {
                bottomCount++;
            } else if (tops[i] == bottoms[0] && bottoms[i] == bottoms[0]) {
                i++;
                continue;
            } else {
                break;
            }
            i++;
        }
        if(i == bottoms.length){
            return Math.min(topCount, bottomCount);
        }
        
        //return -1;
        return -1;
    }
}
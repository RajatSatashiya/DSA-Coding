class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> a[1] - b[1]);
        int count = 1, end = points[0][1];
              
        for(int i = 1; i < points.length; i++) {
            if(end >= points[i][0] && end <= points[i][1]) {
                continue;
            } else {
                end = points[i][1];
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> a[0] == b[0] ? b[1] - a[1] : b[1] - a[1]);
        
        // for(int i = 0; i < boxTypes.length; i++) {
        //     System.out.println(boxTypes[i][0] + " " + boxTypes[i][1]);
        // }
        
        int ans = 0, boxes = 0, index = 0;
        
        while(index < boxTypes.length && boxes < truckSize) {
            int num = boxTypes[index][0];
            if(num > (truckSize - boxes)) {
                num = truckSize - boxes;
            } 
            ans += (num) * boxTypes[index][1];
            boxes += num;
            index++;
        }
        return ans;
    }
}
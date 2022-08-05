class Solution {
    public int[][] merge(int[][] arr){
        List<int[]> li = new ArrayList<>();

        Arrays.sort(arr, (a,b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int lo = arr[0][0];
        int hi = arr[0][1];

        //loop through the array
        for(int i = 1; i < arr.length; i++) {
            //check if arr[i][0] lies in range (lo, hi);
            if(arr[i][0] <= hi){
                hi = Math.max(hi, arr[i][1]);	
            } else {
                li.add(new int[]{lo, hi});
                lo = arr[i][0];
                hi = arr[i][1];
            }
        }
        li.add(new int[]{lo, hi});
        
        // int[][] ans = new int[li.size()][2];
        // for(int i = 0; i < li.size(); i++) {
        //     ans[i][0] = li.get(i)[0];
        //     ans[i][1] = li.get(i)[1];
        // }
        
        return li.toArray(new int[li.size()][2]);
    }
}

/*




*/
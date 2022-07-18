class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length == 1) {
            return 1;
        }
        
        Stack<Double> st = new Stack<>();
        int[][] arr = new int[speed.length][2];
        
        for(int i = 0; i < speed.length; i++) {
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }
        
        //[0,3,5,8,10]  speed = [1,3,1,4,2]
        Arrays.sort(arr, (a,b) -> a[0] == b[0] ? b[1] - a[1] : b[0] - a[0]);
               
        for(int i = 0; i < arr.length; i++) {
            double time = (double)(target - arr[i][0]) / arr[i][1];

            if(!st.isEmpty() && time <= st.peek()) {
                continue;
            } else {
                st.push(time);
            }        
        }
        
        return st.size();
    }
}

//1 1 12 7 
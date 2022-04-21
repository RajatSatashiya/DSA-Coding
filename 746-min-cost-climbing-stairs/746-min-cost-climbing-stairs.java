class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //[10,15,20];
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:cost) arr.add(i);
        arr.add(0);
        
        for(int i = cost.length - 2; i >=0; i--){
            int num1 = arr.get(i) + arr.get(i+2);
            int num2 = arr.get(i) + arr.get(i+1);
            
            arr.set(i, Math.min(num1,num2));
        }
        return Math.min(arr.get(0), arr.get(1));
    }
}
class Solution {
    List<List<Integer>> li = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] can, int target) {
        Arrays.sort(can);
        
        backtrack(can, target, new ArrayList<>(), 0, 0);
        
        return li;
    }
    
    public void backtrack(int[] can, int target, ArrayList<Integer> arr, int sum, int start) {
        if(sum > target) {
            return;
        }
        if(sum == target) {
            li.add(new ArrayList<>(arr));
            return;
        } else {
            for(int i = start; i < can.length && (can[i] <= target - sum); i++) {
                arr.add(can[i]);
                
                backtrack(can, target, arr, sum + can[i], i);
                
                arr.remove(arr.size() - 1);
            }
        }
    }
}
class Solution {
    List<List<Integer>> li = new ArrayList<>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<Integer> arr = new ArrayList<>();
        
        backtracking(candidates, arr, target, -1, 0);
        return li;
    }
    
    public void backtracking(int[] candidates, ArrayList<Integer> arr, int target, int index, int sum){
        if(sum == target) {
            li.add(new ArrayList<>(arr));
        }

        
        for(int i = index + 1; i < candidates.length && (sum + candidates[i] <= target); i++) {
            if(i > index + 1 && candidates[i] == candidates[i-1]) continue;
            arr.add(candidates[i]);
            backtracking(candidates, arr, target, i, sum + candidates[i]);
            arr.remove(arr.size() - 1);
        }
        
    } 
}

//[1, 1, 2, 5, 6, 7, 10] , target = 8
//sum = 0
//


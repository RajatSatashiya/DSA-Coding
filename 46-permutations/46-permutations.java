class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] checked = new boolean[nums.length];
        permutations(nums, new ArrayList<Integer>(), checked);
        return res;
    }
    
    public void permutations(int[] nums, ArrayList<Integer> arr, boolean[] checked) {
        if(arr.size() == nums.length) {
            res.add(new ArrayList<>(arr));
            return;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(checked[i]) continue;
            checked[i] = true;
            arr.add(nums[i]);
            
            permutations(nums, arr, checked);
            
            checked[i] = false;
            arr.remove(arr.size() - 1);
        }
    }
}
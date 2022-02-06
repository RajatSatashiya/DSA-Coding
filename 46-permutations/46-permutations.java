class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> data = new ArrayList<Integer>();
        boolean[] arr = new boolean[nums.length];
        perm(nums, ans, new ArrayList<>(), arr);
        return ans;
    }
    
    private static void perm(int[] nums, List<List<Integer>> ans, List<Integer> data, boolean[] arr){
        if(data.size() == nums.length){
            ans.add(new ArrayList<>(data));
            return;
        }
        
        for(int i=0; i<nums.length; i++){
            if(!arr[i]){
                arr[i] = true;
                data.add(nums[i]);
                perm(nums, ans, data, arr);
                arr[i] = false;
                data.remove(data.size() - 1);
            }
        }
    }
}
class Solution {
    HashSet<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // Arrays.sort(nums, (a,b) -> Integer.compare(b , a));
        Arrays.sort(nums);
        recursion(nums, 0);
        
        // System.out.println("set: " + set);
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(set);
        return ans;
    }
    
    //[1,2,3]
    // 1 + comb(2,3);
    // 1 + (2 + comb(3)); === ([] , [3]) + 2 === ([2], [2,3], [], [3])
    public void recursion(int[] nums, int start) {
        if(start == nums.length - 1) {
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[start]);
            set.add(temp);
            set.add(new ArrayList<>());
            return;
        }
        
        recursion(nums, start + 1);
        
        HashSet<List<Integer>> set2 = new HashSet<>();
        for(List<Integer> li:set) {
            List<Integer> arr = new ArrayList<>(li);
            arr.add(nums[start]);
            set2.add(arr);
            // System.out.println("arr: " + arr);
        }
        
        for(List<Integer> li:set2) {
            set.add(li);
        }
        return;
    }
}

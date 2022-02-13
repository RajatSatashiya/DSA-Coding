class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        
        for(int i:nums){
            ArrayList<List<Integer>> ans2 = new ArrayList<>();
            for(List<Integer> ch:ans){
                ArrayList<Integer> another = new ArrayList<>(ch);
                another.add(i);
                ans2.add(another);
            }
            ans.addAll(ans2);
            // for(List<Integer> curr:ans2){
            //     ans.add(curr);
            // }
        }
        return ans;
    }
}
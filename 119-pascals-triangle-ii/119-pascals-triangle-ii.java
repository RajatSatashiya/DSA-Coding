class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        
        for(int i = 1; i <= rowIndex; i++) {
            ans.add(1); // [0, 1, 2]    [0, 1, 2, 3]
            for(int j = i - 1; j > 0; j--) {
                ans.set(j, ans.get(j) + ans.get(j-1));
            }
        }
        
        return ans;
    }
}
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        if(rowIndex == 0) {
            return ans;
        }
        if(rowIndex == 1) {
            ans.add(1);
            return ans;
        }
        ans.add(1);
        
        for(int i = 2; i <= rowIndex; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 1; j < i; j++) {
                temp.add(ans.get(j - 1) + ans.get(j));
            }
            temp.add(1);
            ans = temp;
        }
        return ans;
    }
}


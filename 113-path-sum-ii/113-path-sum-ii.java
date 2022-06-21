class Solution {
    int sum = 0;
    List<List<Integer>> li = new ArrayList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, targetSum, arr);
        
        return li;
    }
    public void dfs(TreeNode root, int targetSum, ArrayList<Integer> arr) {
        if(root == null) return;
        
        if(root.left == null && root.right == null) {
            sum += root.val;
            arr.add(root.val);
            
            if(sum == targetSum) {
                li.add(new ArrayList<>(arr));
            }
            sum -= root.val;
            arr.remove(arr.size() - 1);
            return;
        }
        
        sum += root.val;
        arr.add(root.val);
        // System.out.println(arr);

        dfs(root.left, targetSum, arr);
        dfs(root.right, targetSum, arr);
        
        sum -= root.val;
        arr.remove(arr.size() - 1);
    }
}
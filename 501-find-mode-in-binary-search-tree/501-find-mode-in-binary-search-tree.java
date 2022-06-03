class Solution {
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap();
        int val = 0;
        check(root, map);
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i:map.keySet()) {
//             val = Math.max(val, map.get(i));
            
//             if(val == map.get(i)) {
//                 arr.clear();
//                 arr.add(i);
//             }
            
            if(map.get(i) > val) {
                val = map.get(i);
                arr.clear();
                arr.add(i);
            } else if(val == map.get(i)) {
                arr.add(i);
            }
        }
        
        int[] ans = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
    
    public void check(TreeNode root, HashMap<Integer, Integer> map) {
        if(root == null) return;
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        
        check(root.left, map);
        check(root.right, map);
    }
}
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p,q);
    }
    
    public boolean check(TreeNode p, TreeNode q) {
        if ((p != null && q == null) || (p == null && q != null)) return false;
        if(p == null && q == null) return true;
        
        if(p.val != q.val) {
            return false;
        }
        
        if(!check(p.left, q.left)){
            return false;
        }
        
        if(!check(p.right, q.right)) {
            return false;
        }
        return true;
    }
}
class Solution {
    int res = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        dfs(cookies, k, 0, new int[k]);
        return res;
    }
    public void dfs(int[] cookies, int k, int cur, int[] children) {
        if(cur == cookies.length) {
            int max = 0;
            for(int i:children) {
                max = Math.max(max, i);
            }
            res = Math.min(res, max);
            return;
        }
        
        for(int i=0; i < k; i++) {
            children[i] += cookies[cur];
            dfs(cookies, k, cur + 1, children);
            children[i] -= cookies[cur];
        }
    }
}
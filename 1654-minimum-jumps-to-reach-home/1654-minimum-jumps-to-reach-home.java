class Solution {
    Set<Integer> forbid = new HashSet<>();
    Set<Integer> visited = new HashSet<>();
    Map<String, Integer> cache = new HashMap<>();
    
    int maxLim;
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        maxLim = 2000 + 2 * b;
        for(int i : forbidden) {
            forbid.add(i);
            maxLim = Math.max(maxLim, 2000 + 2 * b);
        }

        int val = backtracking(a, b, x, 0, 0);
        return (val == Integer.MAX_VALUE) ? -1 : val; 
    }
    
    public int backtracking(int a, int b, int target, int pos, int dir) {
        //base case
        if(cache.containsKey(pos + "" + dir)) return cache.get(pos + "" + dir);
        if(pos == target) return 0;
        if(pos < 0 || (pos > maxLim)) return Integer.MAX_VALUE;
        
        int min = Integer.MAX_VALUE;
        //0 -> forward,  1 -> backward
        visited.add(pos);
        if(pos + a < maxLim && !forbid.contains(pos + a) && !visited.contains(pos + a)) {
            int jump = backtracking(a, b, target, pos + a, 0);
            if(jump != Integer.MAX_VALUE) {
                min = Math.min(min, jump + 1);
            }
        }
        
        if(dir != 1 && pos - b < maxLim && !forbid.contains(pos - b) && !visited.contains(pos - b)) {
            int jump = backtracking(a, b, target, pos - b, 1);
            if(jump != Integer.MAX_VALUE) {
                min = Math.min(min, jump + 1);
            }
        }
        
        visited.remove(pos);
        cache.put(pos + "" + dir, min);
        return min;
    }
}
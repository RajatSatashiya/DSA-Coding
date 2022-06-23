class Solution {
    boolean[] visited;
    boolean[] done;
    ArrayList<Integer> ans = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    
    public int[] findOrder(int numCourses, int[][] pre) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        for(int[] i:pre) {
            ArrayList<Integer> arr;
            if(map.containsKey(i[0])) {
                arr = map.get(i[0]);
            } else {
                arr = new ArrayList<>();
            }
            arr.add(i[1]);
            map.put(i[0], arr);
        }
        
        visited = new boolean[numCourses];
        done = new boolean[numCourses];
        
        
        for(int i = 0; i < numCourses; i++) {
            if(!set.contains(i)){
                dfs(pre, numCourses, i, map);
            }
        }
        
        int[] res = new int[set.size()];
        int index = 0;
        
        if(res.length != numCourses) {
            return new int[0];
        }
        for(int i:ans){
            if(set.contains(i)) {
                res[index] = i;
                index += 1;
                set.remove(i);
            }
        }
        return res;
    }
    
    public boolean dfs(int[][] pre, int numCourses, int val, Map<Integer,ArrayList<Integer>> map) {
        
        visited[val] = true;
        if(map.containsKey(val)) {
            ArrayList<Integer> arr = map.get(val);
            int num = 0;
            for(int i:arr){
                if(visited[i] && !ans.contains(i)) {
                    return false;
                }
                if(set.contains(i)){
                    num++;
                    continue;
                }
                if(dfs(pre, numCourses, i, map)) {
                    num++;
                }
            }
            if(num == arr.size()) {
                done[val] = true;
                ans.add(val);
                set.add(val);
                return true;
            } else {
                return false;
            }
        } else {
            done[val] = true;
            ans.add(val);
            set.add(val);
            return true;
        }
    }
}
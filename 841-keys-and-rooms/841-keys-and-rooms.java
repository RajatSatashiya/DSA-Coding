class Solution {
    public Set<Integer> keys = new HashSet<>();
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        return dfs(rooms, 0);
    }
    
    public boolean dfs(List<List<Integer>> rooms, int index) {
        keys.add(index);
        if(keys.size() == rooms.size()) {
            return true;
        }
        for(int i = 0; i < rooms.get(index).size(); i++) {
            if(keys.contains(rooms.get(index).get(i))) continue;
            
            if(dfs(rooms, rooms.get(index).get(i))) {
                return true;
            }
        }
      
        return false;
    }
}
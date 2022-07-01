class Solution {
    HashSet<Integer> checked = new HashSet<>();
    
    public int[] findRedundantConnection(int[][] edges) {
        ArrayList<Integer>[] arr = new ArrayList[edges.length + 1];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList();
        }
        
        for(int[] edge: edges) {
            checked.clear();
            if(!arr[edge[0]].isEmpty() && !arr[edge[1]].isEmpty() && traverse(arr, edge[0], edge[1])) {
                return edge;
            }
            arr[edge[0]].add(edge[1]);
            arr[edge[1]].add(edge[0]);
            
        }
        return new int[2];
    }
    
    public boolean traverse(ArrayList<Integer>[] arr, int start, int end) {
        if(!checked.contains(start)) {
            checked.add(start);
            if(start == end) return true;
            for(int temp:arr[start]) {
                if(traverse(arr, temp, end)) {
                    return true;
                }
            }
        }
        return false;
    }
}
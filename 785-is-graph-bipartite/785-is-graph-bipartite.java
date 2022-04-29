class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        
        for(int i=0; i<graph.length; i++){
            if(color[i] == 0 && !validNode(graph, color, 1, i)) return false;
        }
        
        return true;
    }
    //1->blue; -1 -> red
    public boolean validNode(int[][] graph, int[] color, int c, int Node) {
        if(color[Node] != 0) {
            return color[Node] == c;
        }
        color[Node] = c;
        for(int n:graph[Node]){
            if(!validNode(graph, color, -c, n)) return false;
        }
        
        return true;
    }
}
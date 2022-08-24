class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer> active = new Stack<>();
        int[] res = new int[n];
        int prev = 0;
        
        for(int i = 0; i < logs.size(); i++) {
            String[] strs = logs.get(i).split(":");
            
            if(!active.isEmpty()) {
                res[active.peek()] += Integer.parseInt(strs[2]) - prev;
            }
            prev = Integer.parseInt(strs[2]);
            if(strs[1].equals("start")) {
                active.push(Integer.parseInt(strs[0]));
            } else {
                res[active.pop()]++;
                prev++;                
            }
            
        }
        
        return res;
    }
}
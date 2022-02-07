class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        if(numCourses == 0 || pre.length == 0){
            return true;
        }
        int[] totalpre = new int[numCourses];
        
        for(int[] i:pre){
            totalpre[i[0]]++;
        }
        
        ArrayDeque<Integer> qu = new ArrayDeque<>();
        for(int i=0; i<numCourses; i++){
            if(totalpre[i] == 0){
                qu.add(i);
            }
        }
        
        int queueSize = qu.size();
        while(!qu.isEmpty()){
            int num = qu.remove();
            
            for(int[] i:pre){
                if(i[1] == num){
                    totalpre[i[0]]--;
                    if(totalpre[i[0]] == 0){
                        queueSize++;
                        qu.add(i[0]);
                    }
                }
            }
        }
        
        
        return queueSize == numCourses;
    }
}
class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,100);
            }else{
                map.put(i,1);
            }
            
            if(map.containsKey(i-1)){
                map.put(i-1,100);
                map.put(i,100);
            }
            if(map.containsKey(i+1)){
                map.put(i+1,100);
                map.put(i,100);
            }
            
        }
        
        for(int i:nums){
            if(map.get(i) != 100){
                ans.add(i);
            }
        }
        return ans;
        
        
    }
}
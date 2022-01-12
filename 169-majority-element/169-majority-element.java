class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int lim = nums.length / 2;
        
        for(int i:nums){
        	if(map.get(i) == null) {
        		map.put(i,1);
        	}else {
        		int count = map.get(i);
                if(count+1 > lim){
                    return i;
                }
        		map.put(i,count+1);
        	}
        }
        
        for(int i:map.keySet()) {
        	if(map.get(i) > lim) {
        		return i;
        	}
        }
        
        return 0;
    }

}
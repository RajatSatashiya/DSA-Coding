class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int lo = 0, hi = 0;
        int max = Integer.MIN_VALUE;
        
        //[1,2,3,2,2]
        
        for(int i = 0; i < fruits.length; i++) {
            if(map.size() < 2) {
                map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
            } else {
                if(map.containsKey(fruits[i])) {
                    map.put(fruits[i], map.get(fruits[i]) + 1);
                } else {
                    while(map.size() != 1) {
                        if(map.get(fruits[lo]) == 1) {
                            map.remove(fruits[lo]);
                        } else {
                            map.put(fruits[lo] , map.get(fruits[lo]) - 1);
                        }
                        lo++;
                    }
                    map.put(fruits[i] , 1);
                }
            }
            max = Math.max(max, i - lo + 1);
        }
        
        return max;
    }
}
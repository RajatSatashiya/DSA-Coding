class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0, lo = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < fruits.length; i++) {
            map.put(fruits[i] , i);
            if(map.size() > 2) {
                int minIndex = Collections.min(map.values());
                map.remove(fruits[minIndex]);
                lo = minIndex + 1;
            }
            max = Math.max(max, i - lo + 1);
        }
        
        return max;
    }
}
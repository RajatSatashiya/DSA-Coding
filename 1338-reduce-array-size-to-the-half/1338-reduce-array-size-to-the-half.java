class Solution {
    public static int val = 0;
    public int minSetSize(int[] arr) {
        // [3,3,3,3,5,5,5,2,2,7]
        
        //4, 3, 2, 1  targetSum = 5;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        //1 2 3 4  target = 5;
        ArrayList<Integer> li = new ArrayList<>(map.values());
        Collections.sort(li);
        int target = arr.length / 2;
        int n = li.size();
        
        backtrack(li, n, target, 0, n - 1, 0);
        return val;
    }
    
    public static boolean backtrack(ArrayList<Integer> arr, int n, int k, int sum, int index, int count) {
	    if(sum >= k) {
            val = count;
	        return true;
	    }
	    if(index < 0 || sum > k) return false;
	    
	    for(int i = 0; i < 2; i++) { //0 -> pick   1 -> not pick
	        if(i == 0) {
	            if(backtrack(arr, n, k, sum + arr.get(index), index - 1, count + 1)) {
	                return true;
	            }
	        } else {
	            if(backtrack(arr, n, k, sum, index - 1, count)) {
	                return true;
	            }
	        }
	    }
	    
	    return false;
	}
}
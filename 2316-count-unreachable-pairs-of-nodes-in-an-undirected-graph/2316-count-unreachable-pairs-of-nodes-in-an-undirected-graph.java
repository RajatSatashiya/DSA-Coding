class Solution {
    public long countPairs(int n, int[][] edges) {
        ArrayList<Integer>[] arr = new ArrayList[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = new ArrayList<>();
        }
        
        for(int[] i:edges) {
            arr[i[0]].add(i[1]);
            arr[i[1]].add(i[0]);
        }
        
        long sum = 0;
        boolean[] checked = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            long count = 0;
            count += traverse(arr, checked, i);
            sum += count * (n - count);
        }
        return sum / 2;
    }
    
    public long traverse(ArrayList<Integer>[] arr, boolean[] checked, int val) {
        if(checked[val]) {
            return 0;
        }
        
        checked[val] = true;
        int count = 1;
        for(int i:arr[val]) {
            count += traverse(arr, checked, i);
        }
        return count;
    }
}
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> arr = new ArrayList<>();
        
        Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        for(int[] i:people) {
            arr.add(i[1], i);
        }
        
        return arr.toArray(new int[arr.size()][2]);
    }
}
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] arr = new int[n];
        boolean[] check = new boolean[n];
        
        for(int[] i:trust){
            check[i[0] - 1] = true;
            arr[i[1] - 1]++;
        }
        
        for(int i=0; i<n; i++){
            if(arr[i] == n - 1 && !check[i]) {
                return i + 1;
            }
        }
        
//         for(int i:arr){
//             System.out.println(i);
//         }
        
//         for(boolean i:check){
//             System.out.println(i);
//         }
        return -1;
    }
}
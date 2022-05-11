class Solution {
    public int countVowelStrings(int n) {
        int ans = 0;
        int[] arr = new int[5];
        
        for(int i=0; i<5; i++){
            arr[i] = 1;
        }
        for(int i=2; i<=n; i++){
            arr[4] = 1;
            for(int j=3; j>=0; j--) {
                arr[j] = arr[j] + arr[j+1];
            }
        }
        for(int i:arr){
            ans += i;
        }
        return ans;
    }
}
class Solution {
    public int[] diStringMatch(String s) {
        int N = s.length();
        int[] perm = new int[N+1];
        int lo = 0, hi = N;
        
        for(int i = 0; i < N; i++){
            if(s.charAt(i) == 'I'){
                perm[i]=lo;
                lo++;
            } else{
                perm[i]=hi;
                hi--;
            }
        }
        
        perm[N] = lo;
        return perm;
    }
}
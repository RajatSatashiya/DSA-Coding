class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 1){
           return s;
        }
        
        //babad
        int len = s.length();
        boolean[][] status = new boolean[len][len];
        
        for(int i=0; i<len; i++){
            status[i][i] = true;
        }
        //babad
        int max = 1;
        int numStart = 0;
        for(int end = 1; end < len; end++){
            for(int start = end-1; start > -1; start--){
                if(s.charAt(start) == s.charAt(end)){                   
                    if(status[start+1][end-1] || end == start+1){
                        // System.out.println(s.substring(start,end+1));
                        int cur = end-start+1;
                        status[start][end] = true;
                        if(end - start + 1 > max){
                            max = end-start+1;
                            numStart = start;
                        }
                    }
                }
            }
        }
        return s.substring(numStart , numStart + max);
    }
}
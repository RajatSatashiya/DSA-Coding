class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        
        if(p.length() > s.length()) return ans;
        //s = "cbaebabacd", p = "abc"
        
        for(char ch:p.toCharArray()){
            arr[ch - 97] += 1;
        }
        int end = 0, begin = 0;
        while(end < s.length()){
            if(begin > 0){
                int remove = s.charAt(begin - 1) - 97;
                arr2[remove] -= 1;
                
            }
            
            int temp = s.charAt(end) - 97;
            arr2[temp] += 1;
            
            if(end - begin + 1 == p.length()){
                if(Arrays.equals(arr,arr2)){
                    ans.add(begin);
                }
                begin++;
            }
            end++;
        }
        
        return ans;
    }
}
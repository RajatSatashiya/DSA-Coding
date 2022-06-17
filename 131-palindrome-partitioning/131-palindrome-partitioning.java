class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> li = new ArrayList<>();
        dfs(s, new ArrayList<String>(), li, 0);
        return li;
    }
    
    //aab
    //a aa 
    public void dfs(String s, ArrayList<String> arr, List<List<String>> li, int start) {
        if(start >= s.length()) {
            li.add(new ArrayList<>(arr));
            return;
        }
        for(int end = start; end < s.length(); end++) {
            if(isPalin(s, start, end)) {
                arr.add(s.substring(start,end + 1));
                dfs(s, arr, li, end + 1);
                arr.remove(arr.size() - 1);
            }
        }
    }
    
    public boolean isPalin(String s, int lo, int hi) {
        while((lo < hi) && (s.charAt(lo) == s.charAt(hi))) {
            lo++;
            hi--;
        }
        return (lo >= hi);
    }
}


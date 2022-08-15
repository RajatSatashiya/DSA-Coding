class Solution {
    int minval = Integer.MAX_VALUE;
    String minstring = "";
    boolean[] checked = new boolean[10];
    
    public String smallestNumber(String pattern) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 1; i <= 9; i++) {
            arr.add(i);
            checked[i] = true;
            
            if(pattern.charAt(0) == 'I') {
                if(recursion(pattern, 0, arr, i + 1, 9)) break;
            } else {
                if(recursion(pattern, 0, arr, 1, i - 1)) break;
            }
            // if(recursion(pattern, 0, arr, i + 1, 9)) break;
            
            checked[i] = false;
            arr.remove(arr.size() - 1);
        }
        return minstring;
    }
    
    public boolean recursion(String pattern, int index, ArrayList<Integer> arr, int start, int end) {
        if(arr.size() == pattern.length() + 1) {
            String ans = "";
            for(int i : arr) {
                ans += i;
            }
            if(minval > Integer.parseInt(ans)) {
                minval = Integer.parseInt(ans);
                minstring = ans;
            }
            return true;
        }
        if(index >= pattern.length() || start > 9 || end < 0) return false;
        
        if(arr.size() == pattern.length()) {
            for(int i = start; i <= end; i++) {
                if(checked[i]) continue;
                arr.add(i);
                if(recursion(pattern, index + 1, arr, i + 1, 9)) return true;
            }
        }
        
        for(int i = start; i <= end; i++) {
            if(checked[i]) continue;
            arr.add(i);
            checked[i] = true;

            if(pattern.charAt(index + 1) == 'I') {
                if(recursion(pattern, index + 1, arr, i + 1, 9)) return true;
            } else {
                if(recursion(pattern, index + 1, arr, 1, i - 1)) return true;
            }
            
            checked[i] = false;
            arr.remove(arr.size() - 1);
        }
        
        return false;
    }
}
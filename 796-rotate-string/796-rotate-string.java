class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        //aabcde abcdea
        
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < goal.length(); i++) {
            if(goal.charAt(i) == s.charAt(0)) {
                arr.add(i);
            }
        }
        
        //arr -> [0,5]
        for(int i = 0; i < arr.size(); i++) {
            boolean flag = true;
            int right = arr.get(i);
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) != goal.charAt(right % goal.length())) {
                    flag = false;
                    break;
                }
                right++;
            }
            
            if(flag) {
                return true;
            }
        }
        
        return false;
    }
}
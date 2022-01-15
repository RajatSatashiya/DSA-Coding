class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 1;
        
        if(s.length() == 0) return 0;
        
        for(int i=0; i<s.length(); i++){
            ArrayList<Character> arr = new ArrayList<Character>();
            arr.add(s.charAt(i));
            
            for(int j=i+1; j<s.length(); j++){
                if(arr.contains(s.charAt(j))){
                    break;
                }else{
                    arr.add(s.charAt(j));
                }
            }
            if(arr.size() > max){
                max = arr.size();
            }
        }
        
        return max;
    }
}
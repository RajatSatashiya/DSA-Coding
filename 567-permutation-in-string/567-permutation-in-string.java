class Solution {
    public boolean checkInclusion(String s1, String s2) {
        boolean ans = false;
        int[] arr = new int[26];
        
        for(char ch:s1.toCharArray()){
            arr[ch - 'a'] += 1;
        }
        
        for(int i = 0; i <= s2.length() - s1.length(); i++){
            char temp = s2.charAt(i);
            if(s1.indexOf(temp) == -1){
                continue;
            }
            int[] arr2 = new int[26];
            for(int j=0; j<s1.length(); j++){
                char ch2 = s2.charAt(i+j);
                arr2[ch2 - 'a'] += 1;
            }

            if(Arrays.equals(arr,arr2)){
                return true;
            }
        }
        return ans;
    }
}
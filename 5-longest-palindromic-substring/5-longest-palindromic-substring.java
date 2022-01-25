class Solution {
    public boolean checkPalin(String s){
        int i=0, j=s.length()-1;
        
        boolean flag = true;
        while(i < j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(left != right){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }
    public String longestPalindrome(String s) {
        int max = Integer.MIN_VALUE;
        String ans = Character.toString(s.charAt(0));
        
        int count = s.length();
        //babadcs, 7->1, 6->2, 5->3, 4->4
        while(count >= 2){
            for(int i=0; i<s.length()+1-count; i++){
                if(count == 3){
                    System.out.println(s.substring(i,i+count));
                }
                if(checkPalin(s.substring(i,i+count))){
                    return s.substring(i,i+count);
                }
            }
                count--;
        }
        return ans;
    }
}
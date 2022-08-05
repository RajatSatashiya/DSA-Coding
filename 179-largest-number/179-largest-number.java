class Solution {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            strs[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(strs, (a,b) -> (b+a).compareTo(a+b));
        
        String ans = "";
        for(String str:strs) {
            ans += str;
        }
        int index = 0;
        while(index < ans.length() - 1 && ans.charAt(index) == '0') {
            index++;
        }
        return ans.substring(index);
    }
}

//10 2
//102 210
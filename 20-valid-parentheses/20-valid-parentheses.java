class Solution {
    public static boolean isValid(String s) {
       Stack<Character> st = new Stack<Character>();
       
       for(int i=0; i<s.length(); i++) {
    	   char cur = s.charAt(i);
    	   if(cur=='(' || cur=='[' || cur=='{') {
    		   st.push(cur);
    	   }else {
    		   if(st.size() == 0) {
    			   return false;
    		   }
    		   if(cur == ')') {
    			   if(st.peek() == '(') {
    				   st.pop();
    			   }else {
    				   return false;
    			   }
    		   }else if(cur == '}') {
    			   if(st.peek() == '{') {
    				   st.pop();
    			   }else {
    				   return false;
    			   }
    		   }else {
    			   if(st.peek() == '[') {
    				   st.pop();
    			   }else {
    				   return false;
    			   }
    		   }
    	   }
       }
       if(st.size() == 0) {
    	   return true;
       }else {
    	   return false;
       }
    }
}
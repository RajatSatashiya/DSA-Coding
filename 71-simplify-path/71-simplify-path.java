class Solution {
    public String simplifyPath(String path) {
        Deque<String> st = new LinkedList<>();
        String[] arr = path.split("/");
        Set<String> ign = new HashSet<>(Arrays.asList("..",".",""));
        
        for(String str : arr) {
            if(!ign.contains(str)){
                st.push(str);
            } else {
                if(str.equals("..") && !st.isEmpty()){
                    st.pop();
                }
            }
        }
        System.out.println(st);
        String ans = "";
        for(String item:st){
            ans = "/" + item + ans;
        }
        
        return ans.isEmpty() ? "/" : ans;
    }
}
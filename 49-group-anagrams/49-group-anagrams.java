class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> li = new ArrayList<>();
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            
            //convert array to string
            String str = "";
            for(char temp : ch) {
                str += temp;
            }
            map.computeIfAbsent(str , name -> new ArrayList<>()).add(i);
        }
        
        for(String str : map.keySet()) {
            List<String> arr = new ArrayList<>();
            for(int i : map.get(str)) {
                arr.add(strs[i]);
            }
            li.add(new ArrayList<>(arr));
        }
        return li;
    }
    
}
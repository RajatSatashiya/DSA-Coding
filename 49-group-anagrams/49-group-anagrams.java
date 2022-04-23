class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //eat, (ate,0) [[0,1,3], [2]]
        //tea, 
        //tan, (ant,2)
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> li = new ArrayList<>();
        int mapCount = 0;
        
        for(int i=0; i<strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            
            if(map.containsKey(str)){
                int key = map.get(str);
                li.get(key).add(i);
            } else {
                map.put(str,mapCount++);
                li.add(new ArrayList<>());
                li.get(mapCount-1).add(i);
            }
        }
        List<List<String>> li2 = new ArrayList<>();
        
        for(int i=0; i<li.size(); i++){
            li2.add(new ArrayList<>());
            for(int j=0; j<li.get(i).size(); j++){
                String val = strs[li.get(i).get(j)];
                li2.get(i).add(val);
            }
        }
        return li2;
    }
}
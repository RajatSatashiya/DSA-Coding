class Solution {
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] ls = new int[26];
        
        for(int i=0; i<s.length(); i++){
            ls[s.charAt(i) - 'a'] = i;
        }
        
        int end = ls[s.charAt(0) - 'a'];
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(ls[s.charAt(i) - 'a'] < end){
                count++;
            } else if (i == end) {
                arr.add(count + 1);
                count = 0;
                if(i + 1 < s.length()){
                    end = ls[s.charAt(i+1) - 'a'];
                }
            } else {
                end = ls[s.charAt(i) - 'a'];
                count++;
            }
        }
        if(count != 0) arr.add(count);
        return arr;
    }
}
class WordFilter {
    HashMap<String, Integer> map = new HashMap<>();

    public WordFilter(String[] words) {
         for(int w = 0; w < words.length; w++){
            for(int i = 0; i <= words[w].length(); i++){
                for(int j = 0; j <= words[w].length(); j++){
                    String str = words[w].substring(0, i) + "#" + words[w].substring(words[w].length()-j);
                    // System.out.println(str);
                    map.put(str, w);
                }
            }
        }
    }
    
    public int f(String prefix, String suffix) {
        // System.out.println(map);
        return (map.containsKey(prefix + "#" + suffix))? map.get(prefix + "#" + suffix) : -1;
    }
}
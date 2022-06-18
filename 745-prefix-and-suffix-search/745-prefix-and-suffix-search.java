class WordFilter {
    HashMap<String, Integer> map = new HashMap<>();

    public WordFilter(String[] words) {
        for(int i = 0; i < words.length; i++) {
            // apple pple ple le e
            //a apple pple ple le e
            //ap apple pple ple le e
            for(int j = 0; j <= words[i].length(); j++) {
                for(int k = 0; k <= words[i].length(); k++) { //k = 0 k = 1
                    String str = words[i].substring(0,j) + "#" + words[i].substring(k, words[i].length());
                    // System.out.println(str);
                    map.put(str, i);
                }
            }
        }
    }
    
    public int f(String prefix, String suffix) {
        return (map.containsKey(prefix + "#" + suffix)) ? map.get(prefix + "#" + suffix): -1;
    }
}

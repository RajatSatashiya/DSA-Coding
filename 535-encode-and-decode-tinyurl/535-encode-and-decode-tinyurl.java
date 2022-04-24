public class Codec {
    HashMap<Integer, String> map = new HashMap<>();
    int index = 0;
    
    public String encode(String longUrl) {
        map.put(index, longUrl)    ;
        return "https://jethalalgada.com/" + index;
    }

    public String decode(String shortUrl) {
        String str = map.get(Integer.parseInt(shortUrl.replace("https://jethalalgada.com/","")));
        return str;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
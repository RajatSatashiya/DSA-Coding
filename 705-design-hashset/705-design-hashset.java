class MyHashSet {
    ArrayList<Boolean> arr;
    int max = Integer.MIN_VALUE;
    public MyHashSet() {
        arr = new ArrayList<>();
    }
    
    public void add(int key) {
        if(arr.size() <= key){
            for(int i = 0; i <= key; i++){
                if(i == key) {
                    arr.add(i, true);
                } else {
                    if(i > max){
                        arr.add(i, false);
                    }
                }
            }
        } else {
            arr.set(key, true);
        }
        
        max = arr.size() - 1;
    }
    
    public void remove(int key) {
        if(key > max){
            return;
        } else {
            arr.set(key, false);
        }
        
    }
    
    public boolean contains(int key) {
        // System.out.println(key + " " + arr + " max: " + max);
        if(key > max){
            return false;
        } else {
            return arr.get(key);
        }
    }
}

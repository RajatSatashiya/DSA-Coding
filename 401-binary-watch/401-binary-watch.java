class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> li = new ArrayList<>();
        
        int[] arr = new int[]{1, 2, 4, 8, 1, 2, 4, 8, 16, 32};
        backtrack(arr, 0, 0, 0, li, turnedOn);
        
        return li;
    }
    
    public void backtrack(int[] arr, int index, int h, int m, List<String> li, int count) {
        if(count == 0) {
            if(h <= 11 && m <= 59) {
                String str = h + ":" + (m <= 9 ? "0" + m:m);
                li.add(str);
                return;
            }
        }
        
        for(int i = index; i < arr.length; i++) {
            if(i <= 3) {
                h += arr[i];
            } else {
                m += arr[i];
            }
            
            backtrack(arr, i + 1, h, m, li, count - 1);
            
            if(i <= 3) {
                h -= arr[i];
            } else {
                m -= arr[i];
            }
        }
    }
}
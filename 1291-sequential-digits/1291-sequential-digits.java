class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> li = new ArrayList<>();
        
        int lo = String.valueOf(low).length();
        int hi = String.valueOf(high).length();
        
        //lo = 3, hi = 3;
        for(int i = lo; i <= hi; i++) {
            for(int j = 0; j < 10 - i; j++) {
                int num = Integer.parseInt(digits.substring(j, j + i));
                if(num >= low && num <= high) {
                    li.add(num);
                }
            }
        }
        
        return li;
    }
}
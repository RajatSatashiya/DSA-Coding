class Solution {
    public int calPoints(String[] ops) {
        int sum = 0, len = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<ops.length; i++){
            char ch = ops[i].charAt(0);
            len = arr.size();
            if(ch == 'C'){
                arr.remove(len - 1);
            } else if(ch == 'D'){
                arr.add(arr.get(len-1) * 2);
            } else if(ch == '+'){
                arr.add(arr.get(len - 1) + arr.get(len-2));
            } else {
                int temp = Integer.parseInt(ops[i]);
                // arr.add(Character.getNumericValue(ch));
                arr.add(temp);
            }
        }
        
        for(int i:arr){
            sum += i;
        }
        return sum;
    }
}
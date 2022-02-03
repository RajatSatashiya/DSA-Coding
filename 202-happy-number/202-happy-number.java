class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hset = new HashSet<Integer>();
        int sum = 0;
       
        while(sum != 1){
            char[] ch = Integer.toString(n).toCharArray();
            sum = 0;
            for(char temp:ch){
                int val = (temp - '0');
                sum += (val * val);
            }
            n = sum;
            System.out.println(n);
            if(!hset.add(n)){
                return false;
            }
            System.out.println(hset);
            
        }
        
        return true;
    }
}
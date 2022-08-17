class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int val = dynamic(coins, amount);
        
        return val;
    }
    
    public int dynamic(int[] coins, int amount) {
        if(amount == 0) {
            return 0;
        }
        if(map.containsKey(amount)) return map.get(amount);

        //1 2 5
        int temp = Integer.MAX_VALUE;
        for(int i = coins.length - 1; i >= 0; i--) {
            if(coins[i] > amount) continue;
            int val = dynamic(coins, amount - coins[i]);
            if(val >= 0) {
                temp = Math.min(temp, 1 + val);
            }
        }
        // System.out.println(temp);
        if(temp == Integer.MAX_VALUE) {
            map.put(amount, - 1);
        } else {
            map.put(amount, temp);
        }
        return map.get(amount);
    }
}
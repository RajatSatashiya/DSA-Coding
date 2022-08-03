class Solution {
    Map<List<Integer>, Integer> map = new HashMap<>();
    
    //buy - 0   sell - 1
    public int maxProfit(int[] prices) {
        return dynamic(prices, 0, 0);       
    }
    
    public int dynamic(int[] prices, int index, int flag) {
        if(index >= prices.length) {
            return 0;
        }
        List<Integer> li = new ArrayList<>();
        li.add(index);
        li.add(flag);
        if(map.containsKey(li)) {
            return map.get(li);
        }
        
        if(flag == 0) { //buy
            int buy = dynamic(prices, index + 1, 1) - prices[index];
            int cool = dynamic(prices, index + 1, flag);
            
            List<Integer> li2 = new ArrayList<>();
            li2.add(index);
            li2.add(flag);
            map.put(li2, Math.max(buy, cool));
        } else {
            int sell = dynamic(prices, index + 2, 0) + prices[index];
            int cool = dynamic(prices, index + 1, flag);
            
            List<Integer> li2 = new ArrayList<>();
            li2.add(index);
            li2.add(flag);
            map.put(li2, Math.max(sell, cool));
        }
        List<Integer> find = new ArrayList<>();
        find.add(index);
        find.add(flag);
        
        return map.get(find);
    }
}
class Solution {
    HashSet<List<Integer>> hs=new HashSet();
    public void sub(int i,int[] nums,List<Integer> l){
        if(i==nums.length){
            // System.out.println(l);
            List<Integer> arr = new ArrayList<>(l);
            Collections.sort(arr);
            hs.add(arr);
            return;
        }
        else{
           
            sub(i+1,nums,l);
            l.add(nums[i]);
            sub(i+1,nums,l);
            l.remove(l.size()-1);
            
            
        }
        return;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> l=new ArrayList<Integer>();
        sub(0,nums,l);
        List<List<Integer>> ll=new ArrayList<List<Integer>>();
        ll.addAll(hs);
        return ll;
        
    }
}
class Solution {
   public static int climbStairs(int n) {
		//1 1 2 3 5 8
		int a = 1;
		int ans = 1;
		
		for(int i=0; i<n-1; i++) {
			int temp = ans + a;
			a = ans;
			ans = temp;
		}
		
		return ans;
		
    }
}
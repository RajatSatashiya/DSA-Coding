class Solution {
    public static int mySqrt(long x) {
    	if(x==0) return 0;
    	//1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4 4 4 4 4 4 4 4
    	//3, 5, 7, 9
    	//3 8 15 
    	long front = 1;
    	long cur = 0;
    	long ans = 1;
    	int count = 1;
    	while(true) {
    		front += 2;
    		cur += front;
    		if(cur >= x) {
    			return count;
    		}
    		count++;
    	}
    }
}
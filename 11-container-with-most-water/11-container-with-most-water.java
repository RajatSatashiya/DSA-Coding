class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        
        int left = 0;
        int right = height.length-1;
        
        while(left < right) {
        	int lval = height[left];
        	int rval = height[right];
        	int area = Math.min(lval,rval) * (right - left);
        	max = (area > max) ? area : max;
        	
        	if(lval < rval) {
        		left++;
        	}else if(rval < lval) {
        		right--;
        	}else {
        		if(height[left+1] > height[right - 1]) {
        			left++;
        		}else {
        			right--;
        		}
        	}
        	
        }
        return max;
    }
}
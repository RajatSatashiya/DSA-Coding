/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo = 1, hi = n, mid = lo + (hi - lo)/2;
        int ans = -1;
        
        while(lo <= hi){
            if(isBadVersion(mid)){
                hi = mid - 1;
                ans = mid;
            } else {
                lo = mid + 1;
            }
            mid = lo + (hi - lo)/2;
        }
        return ans;
    }
}
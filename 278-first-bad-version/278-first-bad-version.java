/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
//         int lo = 1, hi = n;
        
//         while(lo <= hi){
//             int mid = lo + (hi - lo) / 2;
//             if(isBadVersion(mid)){
//                 hi = mid - 1;
//             } else {
//                 lo = mid + 1;
//             }
//         }
//         return lo;
//     }
// }

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;            
        }        
        return start;
    }
}
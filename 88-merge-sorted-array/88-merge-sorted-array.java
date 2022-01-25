class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        
        int l = 0, r = 0, count = 0;
        while(l != m && r != n){
            // System.out.println("nums1: " + nums1[l]);
            // System.out.println("nums2: " + nums2[r]);
            if(nums1[l] <= nums2[r]){
                ans[count] = nums1[l];
                l++;
                count++;
            }else{
                ans[count] = nums2[r];
                r++;
                count++;
            }
        }
        if(l != m){
            for(int i=l; i<m; i++){
                ans[count] = nums1[i];
                count++;
            }
        }else{
            for(int i=r; i<n; i++){
                ans[count] = nums2[i];
                count++;
            }
        }
        
        for(int i=0; i<m+n; i++){
            nums1[i] = ans[i];
        }
    }
}
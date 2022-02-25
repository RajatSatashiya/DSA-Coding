class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int i = 0;
        
        while(i < arr.length && i < arr2.length) {
            int num1 = Integer.parseInt(arr[i]);
            int num2 = Integer.parseInt(arr2[i]);
            
            if(num1 == num2) {
                i++;
                continue;
            } else if(num1 > num2) {
                return 1;
            } else {
                return -1;
            }
        }
        if(i == Math.max(arr.length, arr2.length)) {
            return 0;
        } else {
            if(i == arr.length) {
                for(int j = i; j < arr2.length; j++) {
                    if(Integer.parseInt(arr2[j]) >= 1) return -1;
                }
            } else {
                for(int j = i; j < arr.length; j++) {
                    if(Integer.parseInt(arr[j]) >= 1) return 1;
                }
            }
        }
        return 0;
    }
}
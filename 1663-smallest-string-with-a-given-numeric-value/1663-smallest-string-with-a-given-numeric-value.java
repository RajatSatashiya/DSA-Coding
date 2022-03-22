class Solution {
    public String getSmallestString(int n, int k) {
        char[] arr = new char[n];
        int point = n, last = n - 1;
        
        for(int i = 0; i < n ; i++){
            arr[i] = 'a';
        }
        while(point != k){
            if(point < k){
                // System.out.println("p: " + point + " last: " + last);
                arr[last--] = 'z';
                point = point + ('z' - 'a');
            } else {
                if(k - point > 26){
                    arr[++last] = 'z';
                    point = point + ('z' - 'a');
                } else {
                    arr[++last] = (char) (25 - (point - k) + 'a');
                    break;
                }
            }
        }
        return String.valueOf(arr);
    }
}
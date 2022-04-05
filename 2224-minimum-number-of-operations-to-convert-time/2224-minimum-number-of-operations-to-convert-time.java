class Solution {
    public int convertTime(String current, String correct) {
        int ans = 0;
        String[] arr = current.split(":");
        String[] arr2= correct.split(":");
        
        int h1 = Integer.parseInt(arr[0]);
        int m1 = Integer.parseInt(arr[1]);
        int h2 = Integer.parseInt(arr2[0]);
        int m2 = Integer.parseInt(arr2[1]);
        
        int min1 = h1*60 + m1; //150
        int min2 = h2*60 + m2; //275
        int diff = min2 - min1; //125
        
        while(diff != 0){
            if(diff >= 60) {
                diff -= 60;
            } else if(diff >= 15) {
                diff -= 15;            
            } else if(diff >= 5) {
                diff -= 5;
            } else {
                diff -= 1;
            }
            ans++;
        }
        
        return ans;
    }
}
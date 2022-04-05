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
        int rem = 0;
        
        while(diff != 0){
            if(diff >= 60) {
                rem = diff % 60;
                ans += diff / 60;
                diff = rem;
            } else if(diff >= 15) {
                rem = diff % 15;                
                ans += diff / 15;
                diff = rem;          
            } else if(diff >= 5) {
                System.out.println(ans);
                rem = diff % 5;
                ans += diff / 5;
                diff = rem;
            } else {
                ans += 1;
                diff--;
            }
        }
        
        return ans;
    }
}
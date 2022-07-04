class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        String ans = "A";
        int[] sec = new int[10];
        int[] guss = new int[10];
        
        for(int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                sec[secret.charAt(i) - '0']++;
                guss[guess.charAt(i) - '0']++;
            }
        }
        ans = bulls + ans;
        
        for(int i = 0; i < 10; i++) {
            if(guss[i] != 0 && sec[i] != 0) {
                cows += Math.min(guss[i], sec[i]);
            }
        }
        ans = ans + cows;
        
        return ans + "B"; 
    }
}
class Solution {
    public String removeKdigits(String num, int k) {
        while(k != 0){
            int i = 0;
            boolean flag = true;
            while(i+1 < num.length()){
                int left = num.charAt(i) - '0';
                int right = num.charAt(i+1) - '0';
                if(left > right){
                    num = num.substring(0,i) + num.substring(i+1, num.length());
                    k--;
                    flag = false;
                    break;
                }
                i++;
            }
            if(k==0){
                break;
            }
            // if(i == num.length()-1){
            if(flag){
                num = num.substring(0,num.length()-1);
                k--;
                continue;
            }
        }
        while(num.length() > 1 && num.charAt(0) == '0'){
            num = num.substring(1 , num.length());
        }
        return num == "" ? "0" : num;
    }
}
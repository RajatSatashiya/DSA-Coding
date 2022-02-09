class Solution {
    public long smallestNumber(long num) {
        if(num < 10 && num > -10) return num;
        String str = Long.toString(num);
        
        if(num > 0){
            int[] arr = new int[str.length()];
            for(int i=0; i<str.length(); i++){
                arr[i] = str.charAt(i) - '0';
            }

            for(int i=0; i<str.length()-1; i++){
                int num1 = arr[i], min = arr[i], point = i;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j] < min && (arr[j] != 0 || i != 0)){
                        min = arr[j];
                        point = j;
                    }
                }
                arr[i] = min;
                arr[point] = num1;
                // System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
            }
            String ans = "";
            for(int i:arr){
                ans += i;
            }
            return Long.parseLong(ans);
        } else {
            int[] arr = new int[str.length()-1];
            for(int i=0; i<str.length()-1; i++){
                arr[i] = str.charAt(i+1) - '0';
            }
                        
            for(int i=0; i<arr.length-1; i++){
                int temp = arr[i], max = arr[i], point = i;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j] > max){
                        max = arr[j];
                        point = j;
                    }
                }
                arr[i] = max;
                arr[point] = temp;
            }
            String ans = "-";
            for(int i:arr){
                ans += i;
                // System.out.println(i);
            }
            return Long.parseLong(ans);
        }
        
    }
}
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        
        int count = 0;
        while (i <= j) {
            count++;
            if(people[i] + people[j] <= limit){
                i++;
            }
            j--;
        }
        
        return count;
    }
}
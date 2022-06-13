class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int x : nums) {
            int i = 0, j = size;
            // System.out.println("X: " + x + " size: " + size);
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] < x)
                    i = m + 1;
                else
                    j = m;
            }
            // System.out.println("i: " + i);
            tails[i] = x;
            if (i == size) ++size;
        }
        return size;
    }
}
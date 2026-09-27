class Solution {
    public int longestOnes(int[] nums, int k) {
        if (nums.length <= k) return nums.length;

        int maxlen = 0;
        int count = 0;
        int i = 0;
        int j = 0;
        int earliest = 0;

        while (j < nums.length) {

            if (nums[j] == 0) {
                count++;

                if (count > k) {
                    
                    while (nums[earliest] != 0) {
                        earliest++;
                    }

                   
                    i = earliest + 1;

                   
                    count--;

                    
                    earliest = i;
                }
            }

            maxlen = Math.max(maxlen, j - i + 1);

            j++;
        }

        return maxlen;
    }
}
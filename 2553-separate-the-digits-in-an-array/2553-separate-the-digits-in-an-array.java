class Solution {
    public int[] separateDigits(int[] nums) {
        // Count total digits
        int totalDigits = 0;
        for (int num : nums) {
            if (num == 0) {
                totalDigits++;
            } else {
                int temp = num;
                while (temp > 0) {
                    totalDigits++;
                    temp /= 10;
                }
            }
        }

        int[] ans = new int[totalDigits];
        int index = 0;

        for (int num : nums) {
            if (num == 0) {
                ans[index++] = 0;
                continue;
            }

            int divisor = 1;
            int temp = num;

            while (temp >= 10) {
                divisor *= 10;
                temp /= 10;
            }

            while (divisor > 0) {
                ans[index++] = num / divisor;
                num %= divisor;
                divisor /= 10;
            }
        }

        return ans;
    }
}
class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int prefix = 0;

        for (int i = 0; i < n; i++) {

            int left = nums[i] * i - prefix;

            int rightSum = total - prefix - nums[i];
            int rightCount = n - i - 1;

            int right = rightSum - nums[i] * rightCount;

            ans[i] = left + right;

            prefix += nums[i];
        }

        return ans;
    }
}
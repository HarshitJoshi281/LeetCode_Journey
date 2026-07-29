
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        int[][] dp = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return help(nums, 0, -1, dp);
    }

    public int help(int[] nums, int idx, int prev, int[][] dp) {
        if (idx == nums.length) {
            return 0;
        }

        if (dp[idx][prev + 1] != -1) {
            return dp[idx][prev + 1];
        }

        int skip = help(nums, idx + 1, prev, dp);

        int take = 0;
        if (prev == -1 || nums[idx] > nums[prev]) {
            take = 1 + help(nums, idx + 1, idx, dp);
        }

        return dp[idx][prev + 1] = Math.max(take, skip);
    }
}
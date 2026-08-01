class Solution {
    int MOD = (int)1e9+7;

    public int numOfArrays(int n, int m, int k) {
        int[][][] dp = new int[n][m + 1][k + 1];
        for (int[][] layer : dp) {
            for (int[] row : layer) {
                Arrays.fill(row, -1);
            }
        }
        return help(n, m, 0, k, 0, 0, dp);
    }

    public int help(int n, int m, int maxSofar, int k, int idx, int SearchCost, int[][][] dp) {
        
        if (idx == n) {
            return SearchCost == k ? 1 : 0;
        }
        if (SearchCost > k) {
            return 0;
        }
        if (dp[idx][maxSofar][SearchCost] != -1) {
            return dp[idx][maxSofar][SearchCost];
        }
        int result = 0;
        for (int i = 1; i <= m; i++) {
            if (i > maxSofar) {
                result = (result + help(n, m, i, k, idx + 1, SearchCost + 1, dp)) % MOD;
            } else {
                result = (result + help(n, m, maxSofar, k, idx + 1, SearchCost, dp)) % MOD;
            }
        }
        return dp[idx][maxSofar][SearchCost] = result;
    }
}
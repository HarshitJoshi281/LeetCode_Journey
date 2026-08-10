class Solution {

    public int maxPathScore(int[][] grid, int k) {

        int[][][] dp = new int[grid.length][grid[0].length][k + 1];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                Arrays.fill(dp[i][j], -2);
            }
        }

        return solve(0, 0, k, grid, dp);
    }

    int solve(int i, int j, int k, int[][] grid, int[][][] dp) {

        
        if (i >= grid.length || j >= grid[0].length) {
            return -1;
        }

        
        if (dp[i][j][k] != -2) {
            return dp[i][j][k];
        }

        int cost = grid[i][j] == 0 ? 0 : 1;

        
        if (k < cost) {
            return -1;
        }

       
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return dp[i][j][k] = grid[i][j];
        }

        int down = solve(i + 1, j, k - cost, grid, dp);
        int right = solve(i, j + 1, k - cost, grid, dp);

        
        if (down == -1 && right == -1) {
            return dp[i][j][k] = -1;
        }

        return dp[i][j][k] =
                grid[i][j] + Math.max(down, right);
    }
}
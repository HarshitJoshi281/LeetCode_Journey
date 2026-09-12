class Solution {
    int[][] dp;
    public int longestIdealString(String s, int k) {
        dp = new int[s.length()][27];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(s, 0, -1, k);
    }

    public int solve(String s, int index, int prev, int k) {

       
        if (index == s.length()) {
            return 0;
        }
        if(dp[index][prev+1]!=-1){
            return dp[index][prev+1];
        }

        
        int notTake = solve(s, index + 1, prev, k);

        int take = 0;

        if (prev == -1 || Math.abs(s.charAt(index) - 'a' - prev) <= k) {
            take = 1 + solve(
                s,
                index + 1,
                s.charAt(index) - 'a',
                k
            );
        }

        return dp[index][prev+1]= Math.max(take, notTake);
    }
}
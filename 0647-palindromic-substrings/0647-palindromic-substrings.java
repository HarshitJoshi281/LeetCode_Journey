class Solution {
    int[][] dp = new int[1001][1001];

    public int countSubstrings(String s) {

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return help(s, 0, s.length() - 1);
    }

    public int help(String s, int i, int j) {
        if (i > j) {
            return 0;
        }

        int count = 0;

        for (int end = i; end <= j; end++) {
            if (palindromecheck(s, i, end)) {
                count++;
            }
        }

        return count + help(s, i + 1, j);
    }

    public boolean palindromecheck(String s, int i, int j) {

        if (i >= j) {
            return true;
        }

        if (dp[i][j] != -1) {
            return dp[i][j] == 1;
        }

        if (s.charAt(i) != s.charAt(j)) {
            dp[i][j] = 0;
            return false;
        }

        boolean result = palindromecheck(s, i + 1, j - 1);

        dp[i][j] = result ? 1 : 0;

        return result;
    }
}
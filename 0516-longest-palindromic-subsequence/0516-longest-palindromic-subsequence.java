public class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        // Memoization table initialized to -1
        int[][] memo = new int[n][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return helper(s, 0, n - 1, memo);
    }

    private int helper(String s, int i, int j, int[][] memo) {
        // Base case 1: Out of bounds / invalid range
        if (i > j) {
            return 0;
        }
        // Base case 2: Single character is always a palindrome of length 1
        if (i == j) {
            return 1;
        }
        // Return already calculated state
        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        // If characters match, add 2 and move both pointers inward
        if (s.charAt(i) == s.charAt(j)) {
            memo[i][j] = 2 + helper(s, i + 1, j - 1, memo);
        } else {
            // If they don't match, try both skip options and take the maximum
            memo[i][j] = Math.max(helper(s, i + 1, j, memo), helper(s, i, j - 1, memo));
        }

        return memo[i][j];
    }
}
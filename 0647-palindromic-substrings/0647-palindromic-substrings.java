class Solution {
    public int countSubstrings(String s) {
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

        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }

        return palindromecheck(s, i + 1, j - 1);
    }
}
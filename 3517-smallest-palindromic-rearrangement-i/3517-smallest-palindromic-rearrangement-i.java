class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() <= 1) return s;

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder(s);

        int left = 0;
        int right = s.length() - 1;

        for (int i = 0; i < 26; i++) {
            while (freq[i] >= 2) {
                char ch = (char) ('a' + i);
                sb.setCharAt(left++, ch);
                sb.setCharAt(right--, ch);
                freq[i] -= 2;
            }

            if (freq[i] == 1) {
                sb.setCharAt(s.length() / 2, (char) ('a' + i));
            }
        }

        return sb.toString();
    }
}
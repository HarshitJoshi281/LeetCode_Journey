class Solution {
    public int longestSquareStreak(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int ans = -1;

        for (int num : nums) {

            int root = (int) Math.sqrt(num);

            if ((long) root * root == num && set.contains(root)) {
                continue;
            }

            int len = 1;
            long curr = num;

            while (curr * curr <= Integer.MAX_VALUE &&
                   set.contains((int) (curr * curr))) {

                curr = curr * curr;
                len++;
            }

            if (len >= 2) {
                ans = Math.max(ans, len);
            }
        }

        return ans;
    }
}
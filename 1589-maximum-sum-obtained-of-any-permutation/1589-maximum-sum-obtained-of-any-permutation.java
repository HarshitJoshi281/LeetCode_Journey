class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        int n = nums.length;
        int[] diff = new int[n + 1];

        
        for (int[] req : requests) {
            diff[req[0]]++;
            if (req[1] + 1 < n) {
                diff[req[1] + 1]--;
            }
        }

       
        long[] freq = new long[n];
        freq[0] = diff[0];
        for (int i = 1; i < n; i++) {
            freq[i] = freq[i - 1] + diff[i];
        }

        Arrays.sort(nums);
        Arrays.sort(freq);

        long MOD = 1_000_000_007;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans = (ans + (freq[i] * nums[i]) % MOD) % MOD;
        }

        return (int) ans;
    }
}
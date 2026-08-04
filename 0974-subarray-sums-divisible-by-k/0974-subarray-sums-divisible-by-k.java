class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int result = 0;

        for (int num : nums) {
            sum += num;

            int mod = sum % k;
            if (mod < 0) mod += k;

            result += map.getOrDefault(mod, 0);

            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }

        return result;
    }
}
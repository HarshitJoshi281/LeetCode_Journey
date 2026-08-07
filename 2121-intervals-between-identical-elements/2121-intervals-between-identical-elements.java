class Solution {
    public long[] getDistances(int[] nums) {

        int n = nums.length;
        long[] result = new long[n];

        Map<Integer, Long> count = new HashMap<>();
        Map<Integer, Long> sum = new HashMap<>();

       
        for (int i = 0; i < n; i++) {

            int num = nums[i];

            long c = count.getOrDefault(num, 0L);
            long s = sum.getOrDefault(num, 0L);

            
            result[i] += (long) i * c - s;

            count.put(num, c + 1);
            sum.put(num, s + i);
        }

        
        count.clear();
        sum.clear();

        
        for (int i = n - 1; i >= 0; i--) {

            int num = nums[i];

            long c = count.getOrDefault(num, 0L);
            long s = sum.getOrDefault(num, 0L);

            
            result[i] += s - (long) i * c;

            count.put(num, c + 1);
            sum.put(num, s + i);
        }

        return result;
    }
}
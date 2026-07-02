class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int sum = 0;
        for(int a : nums) {
            sum += a;
            min = Math.min(min, a);
        }
        return sum-n*min;
    }
}
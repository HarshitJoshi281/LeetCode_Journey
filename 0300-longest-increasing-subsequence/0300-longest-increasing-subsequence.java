class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int left = 0, right = list.size() - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (list.get(mid) < nums[i]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (left == list.size()) {
                list.add(nums[i]);
            } else {
                list.set(left, nums[i]);
            }
        }
        return list.size();
    }
}
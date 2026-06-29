class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] result = new int[nums.length];
        Arrays.fill(result,-1);
        long sum =0;
        if(k==0)return nums;
        int window = (2*k)+1;
        if(window>nums.length)return result;
        for(int i =0;i<window;i++){
            sum+=nums[i];
        }
        result[k]=(int) (sum/window);
        for (int i = window; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - window];
            result[i - k] = (int)(sum / window);
        }
        return result;

    }
}
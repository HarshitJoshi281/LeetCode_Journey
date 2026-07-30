class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==1)return 1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int max =1;
        for(int i =1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]>=nums[i])continue;
                else{
                    int temp = dp[j]+1;
                    dp[i]=Math.max(dp[i],temp);
                    
                    //System.out.println(dp[j]);
                    max=Math.max(dp[i],max);
                }
            }
        }
        return max;
    }
}
class Solution {
    
    public long maxAlternatingSum(int[] nums) {
        long[][] dp = new long[nums.length][2];
        for(int i =0;i<nums.length;i++){
            dp[i][0]=-1;
            dp[i][1]=-1;
        }

        return help(0,nums,true,dp);
    }
    public long help(int idx,int[] nums,boolean flag,long[][] dp){
        if(idx==nums.length)return 0;
        int state = flag ? 1 : 0;
        if(dp[idx][state]!=-1){
            return dp[idx][state];
        }
        long skip = help(idx+1,nums,flag,dp);
        int val = nums[idx];
        if(!flag){
            val=-val;
        }
        long take = help(idx+1,nums,!flag,dp)+val;
        return dp[idx][state]= Math.max(take,skip);
    }
}
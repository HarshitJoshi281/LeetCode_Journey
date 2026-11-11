class Solution {
    public int climbStairs(int n, int[] costs) {
        
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
         return 
         
         
         helper(costs,0,n,dp);
    }
      public int helper(int[] costs , int i , int n , int[] dp){
        if(i == n){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int one = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;
        int three = Integer.MAX_VALUE;

        if(i+1 <= n){
            one =  costs[i] + 1 + helper(costs , i+1 , n , dp);
        }

        if(i+2 <= n){
            two = costs[i+1] + 4 + helper(costs , i+2 , n , dp);
        }

        if(i+3 <= n){
            three = costs[i+2] + 9 + helper(costs , i+3 , n , dp);
        }

        return dp[i] = Math.min(one , Math.min(two , three));

    }
}
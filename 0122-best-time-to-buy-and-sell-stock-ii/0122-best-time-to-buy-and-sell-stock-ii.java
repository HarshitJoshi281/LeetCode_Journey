class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int profit = 0;

        for(int i = 1 ; i < n ; i++){
            if(prices[i] > prices[i-1]){
             profit +=prices[i] - prices[i-1];
            }
        }
        return profit;
    }

    public static int helperTabulation2(int[] prices) {

        int n = prices.length;

        int[] dp = new int[n];

        dp[0] = 0;

        for (int i = 1; i < n; i++) {

            int profit = prices[i] - prices[i - 1];

            dp[i] = dp[i - 1] + Math.max(0, profit);
        }

        return dp[n - 1];
    }
}
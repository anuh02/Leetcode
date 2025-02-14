class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n+1][2][k+1];

        for(int i=0;i<=n;i++)
        {
            for(int b=0;b<=1;b++)
            {
                dp[i][b][0] = 0;
            }
        }

        for(int b=0;b<=1;b++)
        {
            for(int t = 0;t<=k;t++)
            {
                dp[n][b][t] = 0;
            }
        }

        int profit = 0;

        for(int i=n-1;i>=0;i--)
        {
            for(int b=0;b<=1;b++)
            {
                for(int t=1;t<=k;t++)
                {
                    if(b == 1)
                    profit = Math.max(-prices[i] + dp[i+1][0][t], 0 + dp[i+1][1][t]);

                    else
                    profit = Math.max(prices[i] + dp[i+1][1][t-1], 0 + dp[i+1][0][t]);

                    dp[i][b][t] = profit;
                }
            }
        }
        return dp[0][1][k];
    }
}
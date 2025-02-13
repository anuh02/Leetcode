class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][][] = new int[n+1][2][3];

        for(int t=0;t < 2;t++)
        {
            for(int b=0;b<=1;b++)
            {
                dp[n][b][t] = 0;
            }
        }
    
        // cap = 0
        for(int i=0;i<n;i++)
        {
            for(int b=0;b<=1;b++)
            {
                dp[i][b][0]=0;
            }
           
        }

        int profit = 0;
        for(int i = n-1; i>=0;i--)
        {
            for(int b=0;b<=1;b++)
            {
                for(int c=1;c<=2;c++)
                {
                if(b == 1)
                profit = Math.max(-prices[i] + dp[i+1][0][c], 0 + dp[i+1][1][c]);

                else
                profit = Math.max(prices[i] + dp[i+1][1][c-1], 0 + dp[i+1][0][c]);

                dp[i][b][c] = profit;
                }
            }
        }
        return dp[0][1][2];
    }
}
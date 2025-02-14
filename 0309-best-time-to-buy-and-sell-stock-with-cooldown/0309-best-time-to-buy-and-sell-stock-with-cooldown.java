class Solution {
    public int maxProfit(int[] prices) {
         int n = prices.length;
        int dp[][] = new int[n+2][2];

        
        int profit = 0;

        for(int i=n-1;i>=0;i--)
        {
            for(int b=0;b<=1;b++)
            {
                  if(b == 1)
                    profit = Math.max(-prices[i] + dp[i+1][0], 0 + dp[i+1][1]);

                    else
                    
                    profit = Math.max(prices[i] + dp[i+2][1], 0 + dp[i+1][0]);

                    dp[i][b] = profit;
                }
            }
        
        return dp[0][1];
    }
    }

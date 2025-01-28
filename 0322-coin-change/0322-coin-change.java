class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];

        for(int t=0;t<=amount;t++)
        {
            if(t % coins[0] == 0)
            dp[0][t]= t/coins[0];
            else
            dp[0][t] = (int) Math.pow(10, 9);
        }

        for(int i=1;i<n;i++)
        {
            for(int t= 0;t <= amount;t++)
            {
                int nt = 0 + dp[i-1][t];
                int tk = Integer.MAX_VALUE;

                if(t >= coins[i])
                tk = 1 + dp[i][t- coins[i]];

                dp[i][t] = Math.min(tk,nt);
            }
        }
     int ans = dp[n-1][amount];
     if(ans >= (int) Math.pow(10,9))
     return -1;
     else
     return ans;
    }
}
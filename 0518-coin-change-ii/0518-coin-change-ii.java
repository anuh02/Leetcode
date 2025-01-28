class Solution {
    public int change(int amount, int[] coins) {
         int n = coins.length;
        int dp[][] = new int[n][amount+1];

        for(int t=0;t<=amount;t++)
        {
            if(t % coins[0] == 0)
            dp[0][t]= (t % coins[0] == 0) ? 1 : 0 ;
           
        }

        for(int i=1;i<n;i++)
        {
            for(int t= 0;t <= amount;t++)
            {
                int nt =  dp[i-1][t];
                int tk = 0;

                if(t >= coins[i])
                tk =  dp[i][t- coins[i]];

                dp[i][t] = tk + nt;
            }
        }
     int ans = dp[n-1][amount];
     return ans;
    }
}
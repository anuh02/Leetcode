class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        int dp[][] = new int[n][n+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                dp[i][j] = -1;
            }
        }

        return f(nums, n, dp, 0,-1);

    }
    public int f(int[] nums, int n, int[][] dp, int ind, int prev )
    {
        if(ind == n)
        return 0;

        if(dp[ind][prev+1] != -1)
        return dp[ind][prev+1];

        int nt =0;
        int tk = 0;

        nt = 0 + f(nums, n, dp, ind+1, prev);
        if(prev == -1 || nums[ind] > nums[prev])
        tk = 1 + f(nums, n, dp, ind+1, ind);

        return dp[ind][prev+1] = Math.max(nt,tk);
    }
}
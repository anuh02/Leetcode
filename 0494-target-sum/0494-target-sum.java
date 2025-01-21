class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int tsum = 0;

        for(int num : nums)
        tsum += num;
        if(tsum - target < 0)
        return 0;
        if((tsum - target)%2 == 1)
        return 0;
        
        int tar  = (tsum - target )/2;

        int dp[][] = new int[n][tar+1];
        if(nums[0] == 0)
        dp[0][0] = 2;
        else
        dp[0][0] = 1;
        if(nums[0] != 0 && nums[0] <= tar)
        dp[0][nums[0]] = 1;

        for(int i=1;i<n;i++)
        {
            for(int t = 0; t<= tar;t++)
            {
                int nt = dp[i-1][t];
                int tk = 0;
                if(nums[i] <= t)
                tk = dp[i-1][t-nums[i]];

                dp[i][t] = tk + nt;
            }
        }
        return dp[n-1][tar];
    }
}
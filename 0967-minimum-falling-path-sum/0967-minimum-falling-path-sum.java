class Solution {
    public int minFallingPathSum(int[][] matrix) {
     int m = matrix.length;
     int dp[][] = new int[m][m];
     for(int j=0;j<m;j++)
     {
        dp[0][j] = matrix[0][j];
     }  

     int  up=0;
     for(int i=1;i<m;i++)
     {
        for(int j=0;j<m;j++)
        {
            up = matrix[i][j] + dp[i-1][j];
            int l = Integer.MAX_VALUE; // Initialize to max value
            int r = Integer.MAX_VALUE;
            if(j-1 >= 0) 
            l =matrix[i][j] + dp[i-1][j-1];
            if(j+1 < m)
            r = matrix[i][j] + dp[i-1][j+1];

            dp[i][j] = Math.min(up,Math.min(l,r));
        }
     } 
     int ans = dp[m-1][0];
     for(int j=1;j<m;j++)
     {
        ans = Math.min(ans, dp[m-1][j]);
     }
     return ans;
    }
}